package Transporte;
//A transportadora Náutica deverá retornar 10% da soma dos dois parâmetros.
public class TransporteNautico extends Transporte{

    public TransporteNautico(int larg, int altura){
    super (altura, larg);
    }
    @Override
    public double calculaFrete(){
        return getAltura() + getLargura() * 0.1;
    }
}
''