package factory.padrao.projeto;

public class Main {
    public static void main(String[] args) {
        FabricaDeVeiculos fabricaDeVeiculos = new FabricaConcretaDeVeiculos();

        VeiculoProduct veiculo1 = fabricaDeVeiculos.obterVeiculo("carro");
        veiculo1.descrever();

        VeiculoProduct veiculo2 = fabricaDeVeiculos.obterVeiculo("caminhão");
        veiculo2.descrever();

        VeiculoProduct veiculo3 = fabricaDeVeiculos.obterVeiculo("motocicleta");
        veiculo3.descrever();
    }
}
