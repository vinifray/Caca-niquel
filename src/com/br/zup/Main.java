package com.br.zup;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas casas do sorteio");
        int resposta = scanner.nextInt();

        if(resposta > 3){
            Maquina maquina = new Maquina(resposta);
            System.out.println(maquina);
        }else {
            Maquina maquina = new Maquina();
            System.out.println(maquina);
        }

    }
}
