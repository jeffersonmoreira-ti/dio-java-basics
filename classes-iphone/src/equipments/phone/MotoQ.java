package equipments.phone;

public class MotoQ implements Phone {
    @Override
    public void ligar() {
        System.out.println("Ligando para um número de telefone... " + "Classe: " + this.getClass().getName());
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone..." + "Classe: " + this.getClass().getName());
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz..." + "Classe: " + this.getClass().getName());
    }
}
