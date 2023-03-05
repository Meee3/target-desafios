package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Two {
    Scanner sc = new Scanner(System.in);
    // valor de entrada
    // fazer a abstração do Fibo
    // inserir um numero e comparar se está na fibo
    // enquanto o numero digitado for menor, aumentar o fibo
    // numero == a fibo esta presente e informar a posição
    // numero > fibo e != nao esta na fibo


    public Two() {
        System.out.println("Digite o valor a ser pesquisado na Fibonacci");
        int valorUsuario = sc.nextInt();
        minhaFibo(valorUsuario);
    }



    void minhaFibo(int valorEntrada) {
        int valorInicial = 1;
        int valorSecundario = 1;
        int valorTerciario = valorInicial + valorSecundario;
        int posicao = 0;
        ArrayList<Integer> minhaArrayFibo = new ArrayList<>();
        minhaArrayFibo.add(valorInicial);
        minhaArrayFibo.add(valorSecundario);
        minhaArrayFibo.add(valorTerciario);
        if(valorEntrada == valorInicial){
            posicao = posicao + 1;

           System.out.println(  "o seu valor está dentro da Fibo e na posição " + posicao);}
        if(valorEntrada == valorSecundario){
            posicao = posicao + 1;
            System.out.println(  "o seu valor está dentro da Fibo e na posição " + posicao);}

        while(valorEntrada >= valorTerciario){
            valorInicial = valorSecundario;
            valorSecundario = valorTerciario;
            valorTerciario = valorInicial + valorSecundario;

            minhaArrayFibo.add(valorTerciario);

        }

        if(minhaArrayFibo.contains(valorEntrada)){
            posicao = minhaArrayFibo.indexOf(valorEntrada);
            System.out.println("O valor de Entrada foi encontrado na lista da Fibonacci");
            System.out.println("A posicao dele é " + (posicao+1));
        }else{
            System.out.println("Valor Digitado não foi encontrado na lista da Fibo.");
        }

        System.out.println();
        System.out.println("Total da Lista percorrida (" + minhaArrayFibo.size() + ")");
        System.out.println(minhaArrayFibo.toString());


        sc.close();

        }
    }

