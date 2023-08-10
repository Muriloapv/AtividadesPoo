package service;

import domain.Produto;

import javax.swing.*;
import java.util.List;

public class CalculadoraService {
    public double valorTotalCompra(List<Produto> produtos){

        double valorTotal = 0;

        for (Produto p: produtos){
            valorTotal += p.getValor();
        }
        return valorTotal;
    }
    public double valorTotalDesconto(List<Produto> produtos){
        double valorDesconto = 0;
        for (Produto p: produtos){
            valorDesconto += p.getDesconto();
        }
        return valorDesconto;
    }
    public double calcularFrete(List<Produto> produtos){
        int freteTotal = 0;
        for (Produto p: produtos){
            freteTotal += (p.getAltura() * p.getLargura()) / p.getPeso();
        }
        return freteTotal;
    }
}
