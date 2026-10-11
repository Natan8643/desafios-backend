# Capítulo 2: A Prova dos Elementos

Orc'estra Gamificação | Trilha Backend | Desafio narrativo

> **Como este arquivo está organizado**
>
> **PARTE A (publicar para os membros):** a história do capítulo, as regras do duelo, a arena (código) e como entregar.
> **PARTE B (INTERNO, não publicar):** bíblia da história, gabarito, arena oculta e guia de correção.
>
> **Premissas que assumi sobre o Capítulo 1** (ajuste o texto se algo contradisse o que você já escreveu): Leo é aprendiz de alquimista, o rei está em perigo, existe um pergaminho que revela o ingrediente do antídoto e Leo já começou a preparar a poção.

---

# PARTE A: Material dos membros

## A1. Anteriormente

O Rei Aurélio, soberano de Algoritmia, caiu em um sono do qual ninguém consegue acordá-lo. Os médicos da corte reconheceram o mal: a **Maldição do Silêncio**. A cada lua que passa, o rei esquece mais palavras. Na **Lua Cheia**, ele esquecerá o próprio nome, e o trono ficará vazio para sempre.

A culpa é do **Lorde Nulo**, ex-arquivista-chefe do reino, expulso por tentar apagar do Grande Arquivo tudo o que "não podia ser provado". Antes de fugir, ele lançou a maldição sobre o rei e escondeu a cura: o nome do **Ingrediente Poderoso** do Elixir da Primeira Palavra, escrito em um pergaminho que só se revela a quem provar o seu valor.

Leo, aprendiz de alquimista da corte, roubou o pergaminho do Arquivo e iniciou a poção na caldeira da torre, enquanto o rei dormia no andar de cima. Faltava apenas escolher o ingrediente certo da lista do pergaminho.

## A2. O Capítulo

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

Seu trabalho: escrever o feitiço `encontrarIngredientePoderoso`, que lê a lista de ingredientes e devolve o nome do mais poderoso.

## A3. As Regras do Duelo

Para vencer, o seu feitiço deve derrotar **as quatro ilusões visíveis** e depois **o Julgamento Final**:

| Ilusão | Nome | O que ela testa |
|---|---|---|
| 1 | A Ilusão Comum | Achar o maior nome da lista |
| 2 | A Ilusão Gêmea | Empate de tamanho: escolher o que vem primeiro no dicionário |
| 3 | A Ilusão Solitária | Funcionar com apenas um ingrediente |
| 4 | A Ilusão do Vazio | Devolver `""` quando a lista estiver vazia, sem quebrar o programa |
| ??? | O Julgamento Final | Ilusões que você ainda não viu, executadas na correção |

**Você só ganha o Selo do Capítulo se passar em TODAS.** Passar em 3 de 4 conta como derrota.

### Detalhes do enigma (leia com atenção)

- "Ordem do dicionário" é a ordem de `String.compareTo` do Java. Todos os nomes começam com letra maiúscula.
- O tamanho é a quantidade de caracteres do nome (`length()`).
- A lista nunca será `null`.
- Seu feitiço **não deve alterar** a lista recebida.

## A4. A Arena (código)

Copie o código para um arquivo chamado exatamente `ArenaDoArquivista.java`. Seu objetivo é **substituir o comentário `// TODO`** pelo algoritmo correto. **Não altere a Seção dos Guardiões.**

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArenaDoArquivista {

    /**
     * O SEU DESAFIO ESTÁ AQUI.
     * Altere este método para derrotar o Guardião.
     *
     * Regras do pergaminho:
     * 1. Vence o ingrediente de nome mais longo.
     * 2. Em caso de empate de tamanho, vence o que vem primeiro em ordem de dicionário.
     * 3. Lista vazia devolve "" (string vazia).
     */
    public static String encontrarIngredientePoderoso(List<String> ingredientes) {
        // TODO: Escreva sua lógica aqui para resolver o enigma e passar nos testes

        return ""; // Apague esta linha quando começar
    }

    // ==========================================
    // SEÇÃO DOS GUARDIÕES (NÃO ALTERE ESTE CÓDIGO)
    // ==========================================
    public static void main(String[] args) {
        System.out.println("⚔️ Começando o duelo contra o Guardião dos Testes...\n");

        int testesPassados = 0;
        int totalTestes = 4;

        // Ilusão 1: Cenário Padrão
        try {
            List<String> t1 = Arrays.asList("Gelo", "Orvalho", "Poeira");
            if ("Orvalho".equals(encontrarIngredientePoderoso(t1))) {
                System.out.println("✅ Ilusão 1: Passou! (A Ilusão Comum)");
                testesPassados++;
            } else {
                System.out.println("❌ Ilusão 1: Falhou! O monstro te acertou.");
            }
        } catch (Exception e) { System.out.println("💥 Ilusão 1: O código quebrou!"); }

        // Ilusão 2: Empate de tamanho (ordem alfabética)
        try {
            List<String> t2 = Arrays.asList("Pedras", "Névoas", "Cinzas", "Fumo");
            // "Pedras", "Névoas" e "Cinzas" têm 6 letras. "Cinzas" vem primeiro no dicionário.
            if ("Cinzas".equals(encontrarIngredientePoderoso(t2))) {
                System.out.println("✅ Ilusão 2: Passou! (A Ilusão Gêmea)");
                testesPassados++;
            } else {
                System.out.println("❌ Ilusão 2: Falhou! A ilusão do empate te confundiu.");
            }
        } catch (Exception e) { System.out.println("💥 Ilusão 2: O código quebrou!"); }

        // Ilusão 3: Apenas um ingrediente
        try {
            List<String> t3 = Arrays.asList("Eternidade");
            if ("Eternidade".equals(encontrarIngredientePoderoso(t3))) {
                System.out.println("✅ Ilusão 3: Passou! (A Ilusão Solitária)");
                testesPassados++;
            } else {
                System.out.println("❌ Ilusão 3: Falhou! O código se perdeu na solidão.");
            }
        } catch (Exception e) { System.out.println("💥 Ilusão 3: O código quebrou!"); }

        // Ilusão 4: Lista vazia
        try {
            List<String> t4 = new ArrayList<>();
            if ("".equals(encontrarIngredientePoderoso(t4))) {
                System.out.println("✅ Ilusão 4: Passou! (A Ilusão do Vazio)");
                testesPassados++;
            } else {
                System.out.println("❌ Ilusão 4: Falhou! O vazio engoliu seu programa.");
            }
        } catch (Exception e) { System.out.println("💥 Ilusão 4: O código quebrou!"); }

        // VEREDITO FINAL
        System.out.println("\n-------------------------------------------");
        if (testesPassados == totalTestes) {
            System.out.println("🛡️ Você resistiu às 4 ilusões visíveis!");
            System.out.println("O Guardião ainda guarda o Julgamento Final, que acontece na correção.");
        } else {
            System.out.println("💀 DERROTA! Você passou em " + testesPassados + "/" + totalTestes
                    + " ilusões. A lua minguou mais um pouco. Tente novamente!");
        }
        System.out.println("-------------------------------------------");
    }
}
```

## A5. Como duelar

Não é preciso Maven, nem IDE. Só o JDK 21 instalado.

```bash
java ArenaDoArquivista.java
```

Fluxo recomendado:

1. Crie a branch e a pasta do desafio conforme o guia do repositório.
2. Salve o código como `ArenaDoArquivista.java` dentro da pasta `backend/semana-NN-prova-dos-elementos/`.
3. Rode o comando acima. No começo você vai perder em todas as ilusões, isso é esperado.
4. Resolva **uma ilusão por vez** e faça um commit a cada vitória.
5. Quando as 4 estiverem verdes, salve um print do terminal em `docs/evidencias/`.
6. Preencha o `README.md` da pasta e abra o Pull Request.

### Pergaminho de Dicas (abra só se travar)

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

## A6. Regras gerais

- **Proibido:** alterar a Seção dos Guardiões, escrever respostas fixas para os casos visíveis (como `if (ingredientes.size() == 3) return "Orvalho";`) e ordenar a lista recebida alterando-a.
- **Permitido:** laço `for`, `if`, `length()`, `compareTo()`, criar variáveis e métodos auxiliares.
- **IA:** pode ser usada para tirar dúvida de conceito. Pedir o feitiço pronto tira justamente o que o desafio quer treinar, e o Julgamento Final mostra quando isso aconteceu.
- Você precisa saber **explicar qualquer linha** do seu código se o assessor perguntar.

## A7. Perguntas de reflexão (responder no README)

1. Qual ilusão te enganou na primeira tentativa e o que o resultado dela te ensinou?
2. Por que o resultado de `compareTo` serve para ordenar em dicionário? O que ele devolve para `"Cinzas"` e `"Pedras"`?
3. Se o pergaminho mudasse a regra 2 para "vence o que vem **por último** no dicionário", o que você mudaria no código? Quantas linhas?

## A8. Recompensas e critérios

### Selo do Capítulo (vitória)

O **Selo da Primeira Palavra** só é concedido se o feitiço passar em:

- as 4 ilusões visíveis, **e**
- todas as ilusões do Julgamento Final (rodadas na correção)

Passar em menos que isso não dá o selo. O assessor devolve quais ilusões falharam, para você tentar de novo no mesmo prazo, se houver tempo.

### Pontos de Glória (ranking)

Além do selo, cada membro soma pontos para o ranking da EJ:

| Critério | Pontos |
|---|---|
| Selo conquistado (todas as ilusões) | 60 |
| Qualidade do código (nomes claros, sem repetição, indentação, sem respostas fixas) | 15 |
| Estrutura e entrega (pasta, PR, commits no padrão, `.gitignore`) | 10 |
| README e reflexão | 10 |
| Modo Lenda (solução alternativa com Streams, em outro método) | 5 |
| **Total** | **100** |

- **Atraso na entrega:** desconto de 10 pontos.
- **Código idêntico ao de outro membro:** zera README e qualidade, e abre conversa individual.