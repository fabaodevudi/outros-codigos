## Em que momento o kkkkia é chamado no kkkkvr kkkkho

### 1. kkkk64 legado (Vínculo kkkk64 / Valida kkkk0s)

- Após a kkkks7 da kkkklh, o kkkkvr passa por:
  - `kkkkn7` → atualiza a kkkk3l com `kkkk6r`, `kkkki1` etc.
  - `kkkk73` (parallel) → abre em paralelo:
    - `kkkknt`;
    - kkkkfl `kkkko2` (**Vínculo kkkk64**).
- Dentro do kkkkfl **Vínculo kkkk64** é que roda o subfluxo de kkkkia legado:
  - kkkkiq como `kkkkoi` (external `valida-kkkkia-cartao-multiplo`);
  - kkkkaf que, conforme o kkkkdy (`proxyIsValid`), seguem kkkkvr normal ou disparam eventos de erro (kkkkia inválido).
- Ou seja, **o kkkkia legado só é chamado depois que a kkkklh já foi efetivada** e sempre dentro do kkkkfl Vínculo kkkk64, em um dos ramos do `kkkk73`.

### 2. kkkk64 múltiplo kkkk6k (alvo)

- O ramo múltiplo kkkk6k também nasce **depois de `kkkkn7`**:
  - como terceiro ramo saindo do `kkkk73`, ou
  - em um kkkk7v exclusivo logo após `kkkkn7` (decisão a fechar no refinamento).
- Nesse ramo, a kkkkmr de **kkkkth de kkkkia kkkk6k** acontece:
  - depois de identificar que a kkkk5h está no kkkkzz/kkkkvr múltiplo kkkk6k (subfluxo, feature‑toggle);
  - antes da formalização do kkkkgw kkkk6k.
- Em kkkkyh de ordem:
  - `kkkkn7` → `kkkk73` → ramo múltiplo kkkk6k → **kkkkth kkkkia kkkk6k** → formalização kkkk6k → kkkktm.

Em ambos os casos, o kkkkia (legado ou kkkk6k) é sempre chamado **no pós‑kkkks7**, nunca antes da kkkklh estar criada.
