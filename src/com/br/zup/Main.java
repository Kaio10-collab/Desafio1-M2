package com.br.zup;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner teclado() { return new Scanner(System.in); }

    public static void main(String[] args) {

        Random gerador = new Random();

        int numeroRandomico = gerador.nextInt(10);
        int pontuacao = 0;
        ArrayList errou = new ArrayList();
        ArrayList acertou = new ArrayList();

        while (true) {
            System.out.println("Digite o número:");

            int teclado = teclado().nextInt();
            if ((teclado!=-1)){
                if (teclado == numeroRandomico) {
                    System.out.println("Parabéns, você ganhou 10 pontos.");
                    pontuacao += 10;
                    acertou.add(teclado);

                } else if (teclado == numeroRandomico -1)  {
                    System.out.println("Parabéns, você ganhou 05 pontos.");
                    pontuacao += 5;
                    acertou.add(teclado);

                } else if (teclado == numeroRandomico +1) {
                    System.out.println("Parabéns, você ganhou 05 pontos.");
                    pontuacao += 5;
                    acertou.add(teclado);

                } else {
                    System.out.println("Você perdeu.");
                    errou.add(teclado);
                }
            }
            if (teclado == -1){
                System.out.println("sua pontuação foi: "+ pontuacao);
                System.out.println("Os números que foram acertados" +acertou.toString());
                System.out.println("Os números que foram errados" +errou.toString());
                break;
            }
        }
    }
}