package factory.padrao.projeto;

public class Carro implements VeiculoProduct{

    @Override
    public void descrever() {
        System.out.println("Sou um carro.");
    }
}
