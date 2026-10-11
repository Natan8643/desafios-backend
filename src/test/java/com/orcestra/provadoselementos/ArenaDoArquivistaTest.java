package com.orcestra.provadoselementos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArenaDoArquivistaTest {

    @Test
    @DisplayName("Ilusao 1: A Ilusao Comum")
    void ilusaoComum() {
        List<String> ingredientes = Arrays.asList("Gelo", "Orvalho", "Poeira");
        assertEquals("Orvalho",
                ArenaDoArquivista.encontrarIngredientePoderoso(ingredientes),
                "O monstro te acertou: o nome mais longo deveria vencer.");
    }

    @Test
    @DisplayName("Ilusao 2: A Ilusao Gemea")
    void ilusaoGemea() {
        // "Pedras", "Névoas" e "Cinzas" têm 6 letras. "Cinzas" vem primeiro no dicionário.
        List<String> ingredientes = Arrays.asList("Pedras", "Névoas", "Cinzas", "Fumo");
        assertEquals("Cinzas",
                ArenaDoArquivista.encontrarIngredientePoderoso(ingredientes),
                "A ilusão do empate te confundiu: no empate, vence o primeiro em ordem de dicionário.");
    }

    @Test
    @DisplayName("Ilusao 3: A Ilusao Solitaria")
    void ilusaoSolitaria() {
        List<String> ingredientes = Arrays.asList("Eternidade");
        assertEquals("Eternidade",
                ArenaDoArquivista.encontrarIngredientePoderoso(ingredientes),
                "O código se perdeu na solidão: um único ingrediente deve vencer.");
    }

    @Test
    @DisplayName("Ilusao 4: A Ilusao do Vazio")
    void ilusaoDoVazio() {
        List<String> ingredientes = new ArrayList<>();
        assertEquals("",
                ArenaDoArquivista.encontrarIngredientePoderoso(ingredientes),
                "O vazio engoliu seu programa: lista vazia deve devolver \"\".");
    }
}
