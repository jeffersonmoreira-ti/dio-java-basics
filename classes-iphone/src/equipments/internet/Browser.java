package equipments.internet;

public class Browser implements InternetCommunicator {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página..." + "Classe: " + this.getClass().getName());
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba..." + "Classe: " + this.getClass().getName());
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página..." + "Classe: " + this.getClass().getName());
    }
}
