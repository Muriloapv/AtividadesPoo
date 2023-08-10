import domain.Monitor;
import domain.Produto;
import domain.Teclado;
import service.CalculadoraService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teclado teclado =  new Teclado("Teclado x", 190d);
        Monitor monitor = new Monitor("Monitor AOC", 1290, 190, 1900d, false);

        CalculadoraService calculadora = new CalculadoraService();

        List<Produto> produtos = new ArrayList<>();
        produtos.add(monitor);
        produtos.add(teclado);

        double resultadoFrete = calculadora.calcularFrete(produtos);


        System.out.println(teclado.getValor());

    }
}
