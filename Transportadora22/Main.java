import Transporte.TransporteNautico;
import Transporte.TransporteTerrestre;

public class Main {

    public static void main(String[] args) {

        TransporteNautico transporteNautico = new TransporteNautico(29, 10);
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre(29, 10);

        System.out.println(transporteNautico.calculaFrete());
        System.out.println(transporteTerrestre.calculaFrete());

    }
}
