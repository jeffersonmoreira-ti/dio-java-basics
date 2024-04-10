package factory.iphone;

import equipments.internet.InternetCommunicator;
import equipments.music.MusicPlayer;
import equipments.phone.Phone;

public class Iphone implements InternetCommunicator, Phone, MusicPlayer {
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

    @Override
    public void tocar() {
        System.out.println("Tocando música..." + "Classe: " + this.getClass().getName());
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música..." + "Classe: " + this.getClass().getName());
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música..." + "Classe: " + this.getClass().getName());
    }

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
