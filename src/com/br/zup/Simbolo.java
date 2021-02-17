package com.br.zup;

/**
 * Simbolo é o enum de classificação de pontuação do sistema.
 *
 */
public enum Simbolo {
    BANANA(10);

    private int pontuacao;

    Simbolo(int pontuacao){
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
