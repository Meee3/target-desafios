package Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Three {
    /*
    3) Descubra a lógica e complete o próximo elemento:



a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2,10, 12, 16, 17, 18, 19, ____



     */

    Scanner sc = new Scanner(System.in);

    public Three(){
        System.out.println("Digite um valor de entrada(Qtd de Repetições)");
        int valorEntrada = sc.nextInt();
        System.out.println("A) Somente ímpares");

        int count = 1;
        int[] resultadoImpar = new int[valorEntrada];

        while(count < valorEntrada) {

            if(count % 2 == 1) {
                for (int i = 0; i < resultadoImpar.length; i++) {
                    resultadoImpar[i] += count;
                    count += 2;
                }

            }

            for(int i = 0; i < resultadoImpar.length; i++) {
                System.out.print("[" + resultadoImpar[i] + "] ");
            }

        }

        System.out.println();
        System.out.println("B) Dobro do Anterior e Par");

        count = 2;
        int[] resultadoPar = new int[valorEntrada];

        for( int i = 0; i < valorEntrada; i ++) {
            if( count % 2 == 0) {
                resultadoPar[i] += count;
            }
            count *= 2;


        }

        for(int i = 0; i < resultadoPar.length; i++) {
            System.out.print("[" + resultadoPar[i] + "] ");
        }


        System.out.println();
        System.out.println("C)Números Quadrados ");

        count = 0;
        int[] resultadoSequenciais = new int[valorEntrada];
        for(int i = 0; i < valorEntrada; i++) {
            resultadoSequenciais[i] = i * i;
        }

        for(int i = 0; i < resultadoSequenciais.length; i++) {
            System.out.print("[" + resultadoSequenciais[i] + "] ");
        }

        System.out.println();
        System.out.println("D) Números Elevados ");

        count = 4;
        int[] resultadoElevados = new int[valorEntrada];

        for (int i = 0; i < valorEntrada; i++) {
            if(i ==0 ) {
                resultadoElevados[i] = 4;
                continue;
            }
            resultadoElevados[i] = count+(8*i) + resultadoElevados[i-1];
        }

        for(int i = 0; i < resultadoElevados.length; i++) {
            System.out.print("[" + resultadoElevados[i] + "] ");
        }

        System.out.println();
        System.out.println("E) Soma dos anteriores ");

        count = 0;
        int[] resultadoAnteriores = new int[valorEntrada];

        for (int i = 0; i < valorEntrada; i++) {
            if(i == 0 || i == 1) {
                resultadoAnteriores[i] = 1;
                continue;
            }

            resultadoAnteriores[i] = (resultadoAnteriores[i-2] + resultadoAnteriores[i -1]);
        }

        for(int i = 0; i < resultadoAnteriores.length; i++) {
            System.out.print("[" + resultadoAnteriores[i] + "] ");
        }


        System.out.println();
        System.out.println("F) Famoso D ");



        int resultadoDEntrada[] = new int[valorEntrada];
        int[] resultadoD = {2,10,12,16,17,18,19,200};

        if(valorEntrada <= 8) {

            for (int i = 0; i < valorEntrada; i++) {
                resultadoDEntrada[i] += resultadoD[i];
            }
        }else {

            System.out.println(Arrays.toString(resultadoD));

        }
        if(valorEntrada <= 8) {
            System.out.println(Arrays.toString(resultadoDEntrada));
            //System.out.println("não acrescentei mais ;o");
        }
		/*for(int i = 0; i < valorEntrada; i++) {
			System.out.print("[" + resultadoDEntrada[i] + "] ");
		}*/
    }





}
