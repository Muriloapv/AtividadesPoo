package Transporte;
//A transportadora Náutica deverá retornar 10% da soma dos dois parâmetros.
public class TransporteNautico extends Transporte{

    public TransporteNautico(int largura, int altura){

        super (altura, largura);
    }
    @Override
    public double calculaFrete(){

        return getAltura() + getLargura() * 0.1;
    }
}
