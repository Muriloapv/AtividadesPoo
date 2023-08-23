package Enuns;

public enum TipoVeiculo {
    CARGA("Automovel de carga"),
    PASSEIO("Automovel de passeio");

    private String automovel;
    TipoVeiculo(String automovel){
        this.automovel = automovel;
    }
    public String getAutomovel(){
        return this.automovel;
    }



}
