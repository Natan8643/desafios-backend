package com.orcestra.provadoselementos;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> ingredientes = List.of("Gelo", "Orvalho", "Poeira");
        String poderoso = ArenaDoArquivista.encontrarIngredientePoderoso(ingredientes);
        System.out.println("Ingrediente poderoso: " + poderoso);
        // Troque a lista acima pelos seus próprios cenários
    }
}
