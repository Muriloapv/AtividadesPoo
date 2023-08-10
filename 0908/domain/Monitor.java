package domain;

public class Monitor implements Produto {

    private String nome;
    private double valor;
    private boolean is220;
    private int altura;
    private int largura;

    public Monitor (String nome, int altura,int largura, double valor, boolean is200){
        this.nome = nome;
        this.valor =  valor;
        this.is220 = is220;
        this.altura =  altura;
        this.largura = largura;

    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public double getDesconto() {
        return this.valor * 0.1;
    }

    @Override
    public int getAltura() {
        return this.altura;
    }

    @Override
    public int getLargura() {
        return this.largura;
    }

    @Override
    public int getPeso() {
        return 2000;
    }
}
