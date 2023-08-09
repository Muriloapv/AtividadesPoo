package Transporte;

public abstract class Transporte {

    private int largura;
    private int altura;

    public Transporte (int altura, int larg){
        this.altura =  altura;
        this.largura = larg;

    }
    public int getLargura(){
        return this.largura;
    }
    public int getAltura(){
        return this.altura;
    }
    public abstract double calculaFrete(){
        getAltura() + getLargura();
    }
}
