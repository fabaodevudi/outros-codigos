Gi,

entendi — vou focar só no **dif** entre o que o kkkk8c espera e o que temos hoje no kkkk7e vs kkkk3l 44.

---

### 1. Campos que eles já usam hoje e que mudam de origem/tipo/semântica

#### `kkkk4t`
- **Hoje (kkkk7e)**: vem como `kkkkxr` no kkkkmn do kkkkho.  
- **No status 44**: passa a ser obtido via kkkk8e (`GET /kkkk7g/{kkkk6r} → kkkk6w`), não vem direto na kkkk3l.

---

#### `kkkk4u`
- **Hoje (kkkk7e)**: `"S"` / `"N"`.  
- **No status 44**: valor numérico (`kkkk6j.kkkk6h` / `kkkk6i`), regra: `> 0` = tem kkkk7d.

---

#### `kkkk4x`
- **Hoje (kkkk7e)**: `kkkk4y`.  
- **No status 44**: `kkkk45` (`kkkk6e.kkkk45`).

---

#### `kkkk40`
- **Hoje (kkkk7e)**: `kkkk43` (timestamp único).  
- **No status 44**: concatenação `kkkk6f + kkkk6g` (precisa alinhar formato/fuso).

---

#### `kkkk4g`
- **Hoje (kkkk7e)**: `${kkkkvr}` da kkkkgq.  
- **No status 44**: valor fixo `"kkkksg"` (chave de rollout do kkkk8c).

---

#### `kkkk41`
- **Hoje (kkkk7e)**: `${kkkk42}`.  
- **No status 44**: regra explícita por plataforma:  
  - kkkk6l → `kkkk6x`  
  - kkkk6k → `kkkk6z`

---

### 2. Campo que existia no kkkkmn antigo e deixa de existir no novo (vira premissa)

#### `kkkk4s`
- **Hoje (kkkk7e)**: fixo `kkkk7b`.  
- **No status 44**: não vai mais no tópico.  
- **Premissa acordada**: todos os eventos são de correntistas.

---

### 3. Campo novo que o kkkk8c passa a olhar no modelo alvo

#### `kkkk44` / `kkkk6b`
- **Hoje (kkkk7e)**: não existia no kkkkmn de kkkk8c.  
- **No status 44**: passa a diferenciar kkkk6l vs kkkk6k usando `kkkk6b`:  
  - `kkkk7f` → kkkk6k  
  - `null` → kkkk6l
