package Desafios._Four;

public class Car extends  Veiculo {
    private boolean semParar;

    public Car(){}

    public Car(short velocidade, boolean semParar){
        velocidade = super.velocidade;
        this.semParar = semParar;
        velocidade = 110;
        semParar = true;
    }

    public boolean isSemParar() {
        return semParar;
    }

    public void setSemParar(boolean semParar) {
        this.semParar = semParar;
    }

    public short getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(short velocidade) {
        this.velocidade = velocidade;
    }

}
