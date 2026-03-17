#!/usr/bin/env python3
"""
Consolida arquivos .md em um único .md com conteúdo criptografado (ASCII).
Não depende de glossário: senha + XOR + PBKDF2, saída base64.

Uso:
  Cifrar:  python3 consolida_md_cifrado.py <diretório> [--out CONSOLIDADO_CIFRADO.md]
  Decifrar: python3 consolida_md_cifrado.py --decrypt CONSOLIDADO_CIFRADO.md
  Decifrar e desconsolidar: ... --decrypt ... --desconsolida --out-dir ./out
"""
import argparse, base64, getpass, hashlib, os, re, sys
from pathlib import Path

SEP = "-----CIPHER-----"
SALT = b"consolida_md_cifrado_v1"

def derive_key(password):
    return hashlib.pbkdf2_hmac("sha256", password.encode("utf-8"), SALT, 100_000, dklen=32)

def xor_cipher(data, key):
    return bytes(data[i] ^ key[i % len(key)] for i in range(len(data)))

def encrypt(plaintext, password):
    return base64.b64encode(xor_cipher(plaintext.encode("utf-8"), derive_key(password))).decode("ascii")

def decrypt(cipher_b64, password):
    return xor_cipher(base64.b64decode(cipher_b64.encode("ascii")), derive_key(password)).decode("utf-8")

def collect_md_files(base, pattern):
    out = []
    for f in sorted(base.rglob(pattern)):
        if not f.is_file() or f.suffix.lower() != ".md": continue
        try: content = f.read_text(encoding="utf-8")
        except Exception as e: print("  Aviso:", f, e, file=sys.stderr); continue
        out.append((str(f.relative_to(base)).replace("\\", "/"), content))
    return out

def build_plain(entries):
    return "\n\n".join("[%s]\n%s\n%s" % (rel, SEP, content) for rel, content in entries)

def split_plain(plain_content):
    blocks = re.split(r"\n" + re.escape(SEP) + r"\n", plain_content)
    out = []
    for block in blocks:
        block = block.strip()
        if not block: continue
        first = block.split("\n")[0].strip()
        if first.startswith("[") and first.endswith("]"):
            body = "\n".join(block.split("\n")[1:]) if "\n" in block else ""
            out.append((first[1:-1].strip(), body))
    return out

def main():
    ap = argparse.ArgumentParser(description="Consolida .md em um .md cifrado (ASCII, sem glossário).")
    ap.add_argument("target", nargs="?")
    ap.add_argument("--decrypt", action="store_true")
    ap.add_argument("--out", default="CONSOLIDADO_CIFRADO.md")
    ap.add_argument("--out-dir", default=None)
    ap.add_argument("--desconsolida", action="store_true")
    ap.add_argument("--pattern", default="*.md")
    args = ap.parse_args()

    if args.decrypt:
        if not args.target or not Path(args.target).is_file():
            print("Com --decrypt informe o arquivo cifrado.", file=sys.stderr)
            sys.exit(1)
        password = getpass.getpass("Senha: ")
        try:
            text = Path(args.target).read_text(encoding="utf-8")
            lines = [l for l in text.split("\n") if not l.startswith("#")]
            entries = split_plain(decrypt("\n".join(lines).strip(), password))
        except Exception as e:
            print("Erro:", e, file=sys.stderr)
            sys.exit(2)
        if args.desconsolida and args.out_dir:
            out_dir = Path(args.out_dir)
            out_dir.mkdir(parents=True, exist_ok=True)
            for rel, body in entries:
                out_file = out_dir / rel.replace("/", os.sep)
                out_file.parent.mkdir(parents=True, exist_ok=True)
                out_file.write_text(body, encoding="utf-8")
                print("  Escrito:", out_file)
            print("Desconsolidados", len(entries), "arquivos em", out_dir)
        else:
            print(build_plain(entries))
        return

    base = Path(args.target).resolve() if args.target and Path(args.target).is_dir() else Path(__file__).resolve().parent
    entries = collect_md_files(base, args.pattern)
    if not entries:
        print("Nenhum .md em", base, file=sys.stderr)
        sys.exit(1)
    password = getpass.getpass("Senha para cifrar: ")
    if password != getpass.getpass("Repita a senha: "):
        print("Senhas não conferem.")
        sys.exit(3)
    out_path = (base / args.out) if not Path(args.out).is_absolute() else Path(args.out)
    header = "# CONSOLIDADO CIFRADO (sem glossário)\n# Descriptografar: python3 consolida_md_cifrado.py --decrypt <este_arquivo>\n\n"
    out_path.write_text(header + encrypt(build_plain(entries), password), encoding="utf-8")
    print("Gerado:", out_path, "(%d arquivos cifrados)" % len(entries))

if __name__ == "__main__":
    main()
