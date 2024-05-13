package factory.padrao.projeto;

public abstract class FabricaDeVeiculos {

    public abstract VeiculoProduct criarVeiculo(String tipo);

    public VeiculoProduct obterVeiculo(String tipo){
        VeiculoProduct veiculoProduct = criarVeiculo(tipo);
        return veiculoProduct;
    }

}
