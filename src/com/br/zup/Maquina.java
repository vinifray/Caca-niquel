package com.br.zup;

import javax.swing.*;
import java.util.Arrays;

/**
 * Classe de controle do sistema de caça-niquel
 *
 * @author Vinicius Ferreira
 */
public class Maquina {
    private Simbolo[] simbolos;
    int pontuacao = 0;

    public Maquina() {
        this.simbolos = new Simbolo[3];
        preecherVetor();
        calcularPontuacao();

    }

    public Maquina(int dificuldade) {
        this.simbolos = new Simbolo[dificuldade];
        preecherVetor();
        calcularPontuacao();
    }

    private void preecherVetor() {
        for (int contador = 0; contador < simbolos.length; contador++) {
            this.simbolos[contador] = Sorteador.sortearSimbolo();
        }
    }

    public Simbolo[] getSimbolos() {
        return simbolos;
    }

    private int calcularPontuacao() {
        for (Simbolo simbolo : simbolos) {
            pontuacao += simbolo.getPontuacao();
        }
        if (existeBonus()) {
            pontuacao *= 100;
        }
        return pontuacao;
    }

    /**
     * Utiliza o Stream do java para comparar todo os objetos do vetor (distinct) e elimina os iguais
     * por fim conta quantos restaram (count), se for apenas 1 então todos os simbolos eram iguais, logo o bonus existe
     *
     * @return boolean
     */
    private boolean existeBonus() {
        long numeros = Arrays.stream(simbolos).distinct().count();
        if (numeros == 1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder model = new StringBuilder();
        model.append("Os simbolos sorteados foram:\n");
        for (Simbolo simbolo : simbolos) {
            model.append(simbolo.name() + ": " + simbolo.getPontuacao() + " Pontos\n");
        }
        model.append("Pontuação Total: " + pontuacao);
        return model.toString();
    }
}
