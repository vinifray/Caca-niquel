package com.br.zup;

/**
 * Simbolo é o enum de classificação de pontuação do sistema.
 *
 */
public enum Simbolo {
    BANANA(10), ESTRELA(40), MORANGO(20);

    private int pontuacao;

    Simbolo(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
