package factory.padrao.projeto;

import java.util.Locale;

public class FabricaConcretaDeVeiculos extends FabricaDeVeiculos{

    @Override
    public VeiculoProduct criarVeiculo(String tipo) {
        if(tipo == null){
            return null;
        }
        switch (tipo.toLowerCase()){
            case "carro":
                return new Carro();
            case "caminhão":
                return new Caminhao();
            case "motocicleta":
                return new Motocicleta();
            default:
                throw new IllegalArgumentException("Tipo desconhecido de veículo.");
        }
    }
}
