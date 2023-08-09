package Transporte;

public class TransporteTerrestre extends Transporte{

    public TransporteTerrestre (int larg, int altura){
        super(altura, larg);
    }
    @Override
    public double calculaFrete(){
        return getAltura() + getLargura() * 0.2;
    }
}
