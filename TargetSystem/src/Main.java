import Desafios.*;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite o número do Exercício");
        int numeroDesafio = sc.nextInt();

        switch(numeroDesafio) {

            case 1:

                One one = new One();
                break;
            case 2:

                Two two = new Two();
                break;
            case 3:

                Three three = new Three();
                break;
            case 4:

                Four four = new Four();
                break;
            case 5:

                Five five = new Five();
                break;
            default:
                System.out.println("De 1 a 5, Encerrando o programa.");
                Runtime.getRuntime().exit(0);
                break;
        }
        }
    }


