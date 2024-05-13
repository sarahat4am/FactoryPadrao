package factory.padrao.projeto;

public class Caminhao implements VeiculoProduct{

    @Override
    public void descrever() {
        System.out.println("Sou um caminhão.");
    }
}
