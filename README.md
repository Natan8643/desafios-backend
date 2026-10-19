# Desafios Semanais: Trilha Backend

Orc'estra Gamificação | Trilha Backend

Este repositório reúne os **desafios semanais da trilha de Backend**. Toda semana aparece aqui uma pasta nova com o enunciado do desafio. Você resolve no **seu fork** e entrega por **Pull Request (PR)**.

```
<repositorio>/
├── README.md          # este arquivo
├── .gitignore
├── desafio01/         # enunciado e kit do desafio 1
├── desafio02/         # aparece quando o desafio 2 for liberado
└── desafioN/
```

---

## 1. Como funciona

| Etapa | Quando | O que você faz |
|---|---|---|
| **Fork** | Uma única vez | Cria a sua cópia do repositório no seu GitHub |
| **Sincronizar** | Toda semana, antes de começar | Traz para o seu fork a pasta do desafio novo |
| **Resolver** | Toda semana | Cria uma branch e resolve dentro da pasta do desafio |
| **Entregar** | Toda semana | Abre um Pull Request do seu fork para este repositório |

**Regra de ouro:** a `main` do seu fork deve ficar **idêntica** à `main` deste repositório. Você nunca trabalha nela. Todo trabalho acontece em uma **branch**.

---

## 2. Antes de começar

- Conta no **GitHub**
- **Git** instalado e configurado com o seu nome e email:

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu-email@exemplo.com"
```

- O que cada desafio exigir de ferramentas (por exemplo, JDK 21) está descrito no `README.md` da pasta do desafio.

---

## 3. Passo 1: Fazer o fork (só uma vez)

1. Abra a página deste repositório no GitHub e clique em **Fork**, no canto superior direito.
2. Mantenha o nome padrão e clique em **Create fork**. Você vai parar no repositório **`<seu-usuario>/<repositorio>`**.
3. Clone **o seu fork** (não o repositório original):

```bash
git clone https://github.com/<seu-usuario>/<repositorio>.git
cd <repositorio>
```

4. Aponte para o repositório original com o nome `upstream`. É por ele que você vai receber os desafios novos:

```bash
git remote add upstream https://github.com/<organizacao>/<repositorio>.git
git remote -v
```

O resultado deve mostrar dois remotos:

| Nome | Aponta para |
|---|---|
| `origin` | O seu fork |
| `upstream` | O repositório original da Orc'estra |

Se `origin` e `upstream` estiverem apontando para o mesmo endereço, você clonou o repositório errado. Apague a pasta e refaça o passo 3.

---

## 4. Passo 2: Ciclo de cada semana

### 4.1 Sincronize o seu fork

**Opção A: pelo site (a mais simples)**

1. Abra o **seu fork** no GitHub.
2. Clique em **Sync fork** e depois em **Update branch**.
3. No terminal, traga a atualização para o seu computador:

```bash
git checkout main
git pull origin main
```

**Opção B: só pelo terminal**

```bash
git checkout main
git fetch upstream
git merge --ff-only upstream/main
git push origin main
```

Depois de sincronizar, a pasta do desafio novo (por exemplo, `desafio02/`) deve aparecer no seu computador. Se ela não apareceu, o desafio ainda não foi liberado ou a sincronização falhou.

Se o `--ff-only` der erro, veja a seção 7.

### 4.2 Crie a branch do desafio

Sempre a partir da `main` sincronizada:

```bash
git checkout -b desafio01
```

O nome da branch é `desafio` mais o número com dois dígitos (`desafio01`, `desafio02`, e assim por diante).

### 4.3 Resolva o desafio

1. Entre na pasta do desafio: `cd desafio01`.
2. Leia o **`README.md` da pasta**. Ele explica a história, as regras e como rodar os testes.
3. Trabalhe **somente dentro da pasta do desafio**.
4. Faça **commits pequenos e frequentes** (o desafio pode pedir um mínimo), no padrão da seção 5.

```bash
git add .
git commit -m "feat: implementa a primeira ilusao"
```

Antes de cada commit, rode `git status` e confira que você **não está versionando** pastas geradas (`target/`) nem arquivos da IDE.

### 4.4 Envie a sua branch

```bash
git push -u origin desafio01
```

### 4.5 Abra o Pull Request

1. Abra o **seu fork** no GitHub. Vai aparecer um aviso amarelo com o botão **Compare & pull request**. Clique nele.
2. Confira os quatro campos no topo da tela:

| Campo | Valor correto |
|---|---|
| base repository | `<organizacao>/<repositorio>` (o **original**) |
| base | `main` |
| head repository | `<seu-usuario>/<repositorio>` (o **seu fork**) |
| compare | `desafio01` (a sua branch) |

3. Título: `[Desafio 01] Seu Nome Sobrenome`
4. Preencha o checklist da descrição.
5. Clique em **Create pull request**.
6. Abra a aba **Files changed** e confira: só devem aparecer arquivos da pasta do **seu** desafio. Se aparecerem arquivos a mais, veja a seção 7.

### 4.6 Ajustes depois do feedback

Se o assessor pedir mudanças, **não abra outro PR**. Faça novos commits na mesma branch e envie:

```bash
git add .
git commit -m "fix: ajusta o desempate"
git push
```

O PR se atualiza sozinho.

### 4.7 O seu PR não será mesclado (e isso é normal)

O assessor vai revisar o código, rodar os testes oficiais, comentar e depois **fechar** o PR. O PR é a **entrega**, não precisa virar parte da `main`. Isso evita que as soluções de todos os membros entrem na mesma pasta e causem conflitos.

---

## 5. Padrões

| Item | Regra |
|---|---|
| Branch | `desafioNN` (exemplo: `desafio01`) |
| Título do PR | `[Desafio NN] Seu Nome Sobrenome` |
| Um PR por desafio | Sempre da branch do desafio para a `main` original |
| O que mexer | **Só** a pasta `desafioNN/` do desafio em andamento |
| O que nunca mexer | A `main` do seu fork, o `README.md` da raiz, o `.gitignore`, as pastas de outros desafios e os arquivos de teste fornecidos (a menos que o enunciado diga o contrário) |
| Nunca versionar | `target/`, `.idea/`, `.classpath`, `.project`, `.settings/`, `*.class`, senhas e tokens |

### Padrão de commits

Formato: `tipo: descrição curta no presente`

| Tipo | Quando usar | Exemplo |
|---|---|---|
| `feat` | implementou algo novo | `feat: trata empate de tamanho` |
| `fix` | corrigiu um erro | `fix: devolve vazio para lista vazia` |
| `test` | adicionou ou ajustou testes seus | `test: adiciona caso com nomes repetidos` |
| `docs` | relatório, anotações | `docs: preenche ENTREGA.md` |
| `refactor` | melhorou o código sem mudar o comportamento | `refactor: extrai metodo auxiliar` |

Mensagens como `ajustes`, `final` ou `asdf` perdem pontos.

---

## 6. Prazo e visibilidade

- **Prazo:** o horário limite de cada desafio está no `README.md` da pasta. O que vale é o conteúdo que estiver no PR até esse horário.
- **Tudo é público.** Um fork de repositório público é público, e os PRs ficam visíveis para todos. Qualquer pessoa pode ver o seu código, e você pode ver o dos outros.
  - Não coloque dados pessoais, senhas ou tokens em nenhum arquivo.
  - Copiar a solução de outro membro **não vale**. O enunciado de cada desafio explica como isso é tratado, e os testes ocultos e as perguntas de reflexão existem justamente para isso.

---

## 7. Se eu errei

| Situação | O que fazer |
|---|---|
| Fiz commits direto na `main` do meu fork | Veja o bloco de recuperação logo abaixo |
| `git merge --ff-only upstream/main` deu erro | A sua `main` divergiu da original. Veja o bloco de recuperação logo abaixo |
| O PR mostra arquivos de mais (como `target/`) | Rode `git rm -r --cached desafio01/target`, depois `git commit -m "fix: remove arquivos gerados"` e `git push`. Confira se o `.gitignore` da raiz está no seu fork |
| Abri o PR com a base ou a branch erradas | Feche o PR (**Close pull request**) e abra outro seguindo a seção 4.5 |
| Mexi em arquivo de outro desafio | Restaure o arquivo: `git checkout main -- caminho/do/arquivo`, depois commit e push |
| Não aparece a pasta do desafio novo | Sincronize o fork de novo (seção 4.1) e confira com `git log --oneline -3` |
| O botão **Compare & pull request** não aparece | Abra a aba **Pull requests** do repositório original e clique em **New pull request**, depois **compare across forks** |

### Bloco de recuperação: devolver a `main` do fork ao estado do original

Isso **guarda o seu trabalho em uma branch** e depois limpa a `main`:

```bash
git branch desafio01-salvo
git fetch upstream
git checkout main
git reset --hard upstream/main
git push --force-with-lease origin main
git checkout desafio01-salvo
```

A partir daí, continue o trabalho na branch `desafio01-salvo` (ou renomeie com `git branch -m desafio01`, se não existir outra com esse nome). Atenção: `reset --hard` apaga alterações **não commitadas**, então faça commit antes.

---

## 8. Glossário rápido

| Termo | O que é |
|---|---|
| **Fork** | Sua cópia pessoal de um repositório, hospedada no seu GitHub |
| **Clone** | Baixar um repositório para o seu computador |
| **origin** | O apelido do **seu fork** |
| **upstream** | O apelido do **repositório original** |
| **Branch** | Uma linha de trabalho separada, para não mexer na `main` |
| **Commit** | Um registro das suas alterações, com uma mensagem |
| **Push** | Enviar os seus commits para o GitHub |
| **Pull Request** | O pedido para o assessor olhar o seu trabalho. É a sua entrega |

---

## 9. Índice de desafios

| Desafio | Tema | Prazo | Pasta |
|---|---|---|---|
| 01 | A Prova dos Elementos (Java, laços e comparação de `String`) | (definir) | [desafio01](desafio01/) |

---

## 10. Dúvidas

Escreva no canal da trilha de Backend com **o que você tentou** e o **resultado do terminal**. Se travar com o Git, avise antes do prazo, não no dia da entrega.

---