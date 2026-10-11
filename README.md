# ⚔️ Capítulo 2: A Prova dos Elementos

Desafio Semanal 01 | Trilha Backend | Orc'estra Gamificação

---

## 📜 Anteriormente

O Rei Aurélio, soberano de Algoritmia, caiu em um sono do qual ninguém consegue acordá-lo. Os médicos da corte reconheceram o mal: a **Maldição do Silêncio**. A cada lua que passa, o rei esquece mais palavras. Na **Lua Cheia**, ele esquecerá o próprio nome, e o trono ficará vazio para sempre.

A culpa é do **Lorde Nulo**, ex-arquivista-chefe do reino, expulso por tentar apagar do Grande Arquivo tudo o que "não podia ser provado". Antes de fugir, ele lançou a maldição sobre o rei e escondeu a cura: o nome do **Ingrediente Poderoso** do Elixir da Primeira Palavra, escrito em um pergaminho que só se revela a quem provar o seu valor.

Leo, aprendiz de alquimista da corte, roubou o pergaminho do Arquivo e iniciou a poção na caldeira da torre, enquanto o rei dormia no andar de cima. Faltava apenas escolher o ingrediente certo da lista do pergaminho.

---

## 🧙 O Capítulo

A poção começou a borbulhar, mas a fumaça da caldeira congelou no ar e tomou forma: uma criatura de sombra e gelo, com olhos sem fundo e uma voz que arrastava as pedras da torre. Era **o Guardião dos Testes**, sentinela deixada por Lorde Nulo.

"Aprendiz," disse a criatura, "meu mestre me ensinou uma única verdade: **o que não passa no teste não existe**. Muitos tentaram adivinhar o ingrediente do pergaminho. Todos foram apagados."

Leo olhou para cima. Pelas frestas do teto, via a lua minguar. Faltava pouco.

"Eu lançarei **quatro ilusões** contra o seu feitiço," continuou o Guardião. "Cada uma testa um erro em que os tolos sempre caem. Se o seu feitiço falhar em **uma** delas, a poção se desfaz, e o rei perde mais uma lua. Se resistir a todas, você terá o direito de salvá-lo."

Quando o Guardião falou da quarta ilusão, um sorriso gelado atravessou o rosto de fumaça.

"Ah, e há mais ilusões na minha manga do que as que você pode ver. **O Julgamento Final** é quando elas aparecem."

### O enigma do pergaminho

O pergaminho de Lorde Nulo traz uma lista de ingredientes e três regras escritas na antiga língua dos alquimistas:

1. *"O poder de um ingrediente está no tamanho do seu nome verdadeiro. Vence o nome mais longo."*
2. *"Se dois nomes têm o mesmo tamanho, vale o que vem primeiro no Grande Arquivo, que guarda tudo em ordem de dicionário."*
3. *"Se não há ingrediente na lista, a caldeira permanece em silêncio, e o silêncio é uma palavra vazia."*

---

## 🎯 Sua missão

Você é a mão que escreve o feitiço de Leo. Seu trabalho é fazer funcionar o método:

```java
public static String encontrarIngredientePoderoso(List<String> ingredientes)
```

Ele recebe a lista de ingredientes do pergaminho e devolve o nome do mais poderoso, seguindo as três regras acima.

**Detalhes do enigma:**

- "Ordem do dicionário" é a ordem de `String.compareTo` do Java. Todos os nomes começam com letra maiúscula.
- O tamanho do nome é a quantidade de caracteres (`length()`).
- A lista nunca será `null`.
- O seu feitiço **não deve alterar** a lista recebida.

---

## 🐉 As regras do duelo

Para ganhar o **Selo da Primeira Palavra**, o seu feitiço precisa derrotar **todas** as ilusões:

| Ilusão | Nome | O que ela testa |
|---|---|---|
| 1 | A Ilusão Comum | Achar o maior nome da lista |
| 2 | A Ilusão Gêmea | Empate de tamanho: escolher o que vem primeiro no dicionário |
| 3 | A Ilusão Solitária | Funcionar com apenas um ingrediente |
| 4 | A Ilusão do Vazio | Devolver `""` quando a lista estiver vazia, sem quebrar o programa |
| ??? | **O Julgamento Final** | Ilusões que você ainda não viu, executadas na correção |

**Não existe vitória parcial.** Passar em 3 de 4 é derrota. E passar nas 4 visíveis ainda não garante o selo: o Julgamento Final só acontece na correção, com cenários novos.

> 💡 O Julgamento Final existe para premiar quem entendeu o problema, não quem decorou as respostas dos testes que consegue ver.

---

## 🗺️ Conhecendo o seu projeto

Este projeto já vem **pronto e configurado**. Você não precisa criar nem mexer em nada além do indicado abaixo. Ele usa a estrutura padrão de projetos Java com Maven, a mesma que você vai encontrar em projetos reais e nos projetos de backend da EJ.

```
semana-01-prova-dos-elementos/
├── README.md                         # este arquivo (não edite)
├── ENTREGA.md                        # o seu relatório (VOCÊ PREENCHE)
├── pom.xml                           # configuração do projeto (não mexa)
├── mvnw, mvnw.cmd, .mvn/             # Maven Wrapper: roda o Maven sem instalar nada
├── docs/
│   └── evidencias/                   # coloque aqui o print dos seus testes
└── src/
    ├── main/java/com/orcestra/provadoselementos/
    │   ├── ArenaDoArquivista.java    # ⭐ VOCÊ EDITA AQUI
    │   └── App.java                  # para você experimentar na mão
    └── test/java/com/orcestra/provadoselementos/
        └── ArenaDoArquivistaTest.java    # as 4 ilusões (não altere)
```

| Pasta ou arquivo | O que é |
|---|---|
| `src/main/java` | O **código do programa**. É aqui que você trabalha |
| `src/test/java` | Os **testes** que verificam o seu código. Eles são o Guardião |
| `com/orcestra/provadoselementos` | O **pacote**. Em Java, as pastas refletem o nome do pacote |
| `pom.xml` | A "receita" do projeto: versão do Java e bibliotecas usadas. Já está pronto |
| `target/` | Aparece depois que você roda o Maven. É código compilado e relatórios, **gerado automaticamente**. Nunca vai para o GitHub |

---

## ⌨️ Comandos que você vai usar

Rode todos dentro da pasta do desafio. Use `./mvnw` no Linux e no macOS. No Windows, use `.\mvnw.cmd` (PowerShell) ou `mvnw.cmd` (Prompt de Comando).

| Comando | O que faz |
|---|---|
| `./mvnw test` | Compila tudo e roda os testes. **É o seu duelo contra o Guardião** |
| `./mvnw compile` | Só compila o código de `src/main` |
| `./mvnw clean` | Apaga a pasta `target/` |
| `./mvnw clean test` | Apaga o que estava compilado e roda tudo do zero |

Para rodar o `App` (o seu campo de treino) depois de compilar:

```bash
./mvnw compile
java -cp target/classes com.orcestra.provadoselementos.App
```

> ⏳ **Na primeira vez**, o Maven baixa algumas bibliotecas. Precisa de internet e pode levar alguns minutos. Nas próximas, é rápido.

**Pré-requisito:** ter o **JDK 21** instalado. Para conferir, rode `java -version`. Se algo não funcionar, fale com o assessor no canal da trilha antes do prazo, não no dia da entrega.

---

## 🧭 Como trabalhar, passo a passo

1. **Prepare o repositório.** Crie a branch `backend/semana-01` e coloque esta pasta dentro de `backend/` do seu repositório, conforme o `GUIA-DO-MEMBRO.md`.
2. **Veja o duelo perdido.** Dentro da pasta do desafio, rode `./mvnw test`. Você deve ver **3 ilusões falhando e 1 passando**. Isso é esperado.
3. **Abra o `ArenaDoArquivista.java`** e leia o comentário do método. Ele resume as regras do pergaminho.
4. **Resolva uma ilusão por vez.** Mexa um pouco, rode `./mvnw test`, leia o resultado, ajuste. Repita.
5. **Faça um commit a cada ilusão derrotada**, com mensagens no padrão `tipo: descrição` (por exemplo, `feat: trata empate de tamanho`).
6. **Teste na mão.** Edite a lista no `App.java` com os seus próprios cenários e rode o `App`. Invente casos difíceis: nomes repetidos, todos do mesmo tamanho, nome vazio na lista.
7. **Quando as 4 estiverem verdes**, salve um print do terminal em `docs/evidencias/`.
8. **Preencha o `ENTREGA.md`** com as decisões, as dificuldades e as respostas das perguntas de reflexão.
9. **Abra o Pull Request** para a `main`, com o título `[Backend] Semana 01: A Prova dos Elementos`. **Não faça o merge.** Quem faz é o assessor.

### 🔎 Como ler o resultado do `./mvnw test`

Quando uma ilusão te derrota, o Maven mostra algo parecido com isto (o formato exato varia):

```
[ERROR] Failures:
[ERROR]   ArenaDoArquivistaTest.ilusaoGemea:NN A ilusão do empate te confundiu... ==> expected: <Cinzas> but was: <Pedras>
[ERROR] Tests run: 4, Failures: 3, Errors: 0, Skipped: 0
```

- `expected` é o que o Guardião esperava. `but was` é o que o **seu código devolveu**.
- O nome do teste (`ilusaoGemea`) diz qual ilusão te acertou.
- **Errors** é diferente de **Failures**: significa que o seu código quebrou com uma exceção. Role para cima e leia a mensagem.
- No fim, `BUILD SUCCESS` significa vitória nas ilusões visíveis. `BUILD FAILURE` significa derrota.

> ⚠️ Na primeira execução, a **Ilusão 4 passa por acaso**: o código inicial já devolve `""`. Esse "verde" não prova nada. Não comemore ainda.

---

## 📜 Pergaminho de Dicas (abra só se travar)

<details>
<summary>Dica 1: por onde começar</summary>

Pense em uma variável chamada `melhor`, que guarda "o ingrediente mais poderoso visto até agora". Percorra a lista e, a cada ingrediente, decida se ele destrona o `melhor`.

</details>

<details>
<summary>Dica 2: as ferramentas de que você precisa</summary>

O tamanho de uma `String` vem de `length()`. Para comparar dois nomes em ordem de dicionário, use `a.compareTo(b)`: o resultado é **negativo** se `a` vem antes de `b`, zero se são iguais e positivo se `a` vem depois.

</details>

<details>
<summary>Dica 3: o que fazer antes do laço</summary>

Decida o que acontece com o `melhor` **antes** de olhar o primeiro ingrediente. Uma lista vazia nunca entra no laço. O que o feitiço devolve nesse caso?

</details>

Se continuar travado por mais de 40 minutos, escreva a sua dúvida no canal da trilha com o que você já tentou.

---

## 📏 Regras

- **Proibido:**
  - alterar o `ArenaDoArquivistaTest.java` ou qualquer arquivo de `src/test`
  - escrever respostas fixas para os casos que você vê (como `if (ingredientes.size() == 3) return "Orvalho";`)
  - alterar a lista recebida (por exemplo, ordenando-a)
  - versionar a pasta `target/`
- **Permitido:** laço `for`, `if`, `length()`, `compareTo()`, variáveis e métodos auxiliares.
- **Ferramentas de IA:** podem ser usadas para tirar dúvida de conceito. Pedir o feitiço pronto tira justamente o que este desafio quer treinar, e o Julgamento Final mostra quando isso aconteceu.
- Você precisa saber **explicar qualquer linha** do seu código se o assessor perguntar.

---

## 🏆 Recompensas e pontuação

O **Selo da Primeira Palavra** só é concedido se o seu feitiço passar nas 4 ilusões visíveis **e** em todo o Julgamento Final. Quem ganha o selo avança na história para o próximo capítulo.

Além do selo, você soma **Pontos de Glória** para o ranking da EJ:

| Critério | Pontos |
|---|---|
| Selo conquistado (todas as ilusões) | 60 |
| Qualidade do código (nomes claros, sem repetição, indentação, sem respostas fixas) | 15 |
| Estrutura e entrega (pasta e pacote no padrão, PR, commits no padrão, sem `target/`) | 10 |
| `ENTREGA.md` preenchido e perguntas de reflexão | 10 |
| Bônus: arquivo `MeusTestesTest.java` com 3 ou mais testes seus, em `src/test` | 3 |
| Bônus: uma segunda solução usando Streams, em outro método | 2 |
| **Total** | **100** |

- **Atraso na entrega:** desconto de 10 pontos.
- **Código idêntico ao de outro membro:** zera o `ENTREGA.md` e a qualidade do código, e abre conversa individual.
- Todo membro recebe **3 pontos fortes e 3 pontos de melhoria** como comentários no Pull Request.

---

Boa sorte, aprendiz. A lua não espera. 🌙