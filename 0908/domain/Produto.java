package domain;

public interface Produto {

    double getValor();
    double getDesconto();
    int getAltura();
    int getLargura();
    int getPeso();

}
/*a*l/p
    private String nome;
    private int valor;
    private int altura;
    private int largura;
    private int peso;

   public Produto(String nome, int valor, int altura, int largura, int peso){
       this.nome = nome;
       this.valor = valor;
       this.largura =  largura;
       this.peso = peso;
       this.altura = altura;

   }
   public int getLargura(){
       return this.largura;
   }
   public int getValor(){
       return this.valor;
   }
   public int getAltura(){
       return this.altura;
   }
   public int getPeso(){
       return this.peso;
   }
   public String getNome(){
       return  this.nome;
   }*/
