import Enuns.TipoVeiculo;

public class Automovel extends Motorista {

    private double fipe;

    TipoVeiculo autocarga = TipoVeiculo.CARGA;
    TipoVeiculo autopasseio = TipoVeiculo.PASSEIO;

    public Automovel (double fipe){
        this.fipe = fipe;
    }
    public double getFipe(){
        return fipe;
    }
}
