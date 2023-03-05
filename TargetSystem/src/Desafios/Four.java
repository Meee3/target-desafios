package Desafios;

import Desafios._Four.*;

public class Four {
    Car carro = new Car();
    Truck caminhao = new Truck();


    public Four(){

        carro.setVelocidade((short) 110);
        caminhao.setVelocidade((short) 80);

        System.out.println("Velocidade do Caminhão: " + caminhao.getVelocidade() + "km/h");

        System.out.println("Velocidade do Carro: "+ carro.getVelocidade() + "km/h");
        System.out.println("O percurso será de 100km\n");
        System.out.println("O Tempo médio do carro e do caminhão para concluir a viagem será de: ");

        int percurso = 100;
        int hora = 60;
        float tempoMedioCarro = (float)(percurso * hora) / carro.getVelocidade();
        double tempoMedioCaminhao =(double) (percurso * hora) / caminhao.getVelocidade();

        System.out.printf("Carro: %.2f em minutos\n", tempoMedioCarro);
        System.out.printf("Caminhão %.2f em minutos\n",tempoMedioCaminhao);

        System.out.println("\nVamos acrescentar dois pedágios no percurso do caminhão, ");
        tempoMedioCaminhao += 10;
        System.out.println("Levará 5 minutos em cada pedágio o resultado é: " + tempoMedioCaminhao);
        //MMC deles 1760 minutos
        System.out.println("Vamos realizar o MMC de ambos, 110 e 85");
        int mmcAmbos = 1870;
        mmcAmbos = mmcAmbos  / 60;
        System.out.println("\nEm "+ mmcAmbos + " minutos se encontrarão");
        System.out.print("A distância percorrida pelo carro neste tempo será de:");

        float tempoGastoCarro = carro.getVelocidade() * mmcAmbos / 60;
        System.out.println(tempoGastoCarro+ "km");

        System.out.printf("E do Caminhão será de: ");
        double tempoGastoCaminhao = caminhao.getVelocidade() * mmcAmbos / 60;
        System.out.println(tempoGastoCaminhao+ "km");

        System.out.println("Agora se subtrairmos iremos ter o veículo mais próximo de RP");
        System.out.println("O Carro está a distância de 56 km longe de RP");
        System.out.println("Já o Caminhão está a distância de: " + (100-41)+ "km");
        System.out.println("Conclusão o carro é o mais próximo\n\n\n\n");

    }

}
