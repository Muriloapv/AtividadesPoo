package Transporte;

public class TransporteTerrestre extends Transporte{

    public TransporteTerrestre (int largura, int altura){

        super(altura, largura);
    }
    @Override
    public double calculaFrete(){

        return getAltura() + getLargura() * 0.2;
    }
}
