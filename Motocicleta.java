package factory.padrao.projeto;

public class Motocicleta implements VeiculoProduct{

    @Override
    public void descrever() {
        System.out.println("Sou uma motocicleta.");
    }
}
