package Transporte;

public abstract class Transporte {

    private int largura;
    private int altura;

    public Transporte (int altura, int largura){
        this.altura =  altura;
        this.largura = largura;

    }
    public int getLargura(){

        return this.largura;
    }
    public int getAltura(){

        return this.altura;
    }
    public abstract double calculaFrete();

}
