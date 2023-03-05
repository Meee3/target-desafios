package Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Five {
    Scanner sc = new Scanner (System.in);

    public Five(){

        String Texto = "Uma Palavra Qualquer";
        System.out.println("O Texto é " + Texto);

        char vetor[];
        vetor = Texto.toCharArray();


        char[] vetorInvertido = new char[vetor.length];
        int count = vetor.length;
        for(int i = 0; i < vetor.length; i++) {


            vetorInvertido[count-1] = vetor[i];
            count--;
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println(Arrays.toString(vetorInvertido));

    }

}
