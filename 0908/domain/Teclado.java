package domain;

public class Teclado implements Produto{
    private String nome;
    private int valor;

    public Teclado(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public double getDesconto() {
        return this.valor *0.08;
    }

    @Override
    public int getAltura() {
        return 2;
    }

    @Override
    public int getLargura() {
        return 50;
    }

    @Override
    public int getPeso() {
        return 180;
    }
}
