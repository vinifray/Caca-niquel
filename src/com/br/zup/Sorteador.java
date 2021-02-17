package com.br.zup;

import java.util.Random;

/**
 * Classe para sorteio de simbolos do sistema de caça-niquel
 * @author Vinicius Ferreira
 * @version v0.0
 */
public class Sorteador {
    private static Random random = new Random();

    public static Simbolo sortearSimbolo(){
        Simbolo[] simbolos = Simbolo.values();
        int posicaoAleatoria = random.nextInt(simbolos.length);
        return simbolos[posicaoAleatoria];
    }
}
