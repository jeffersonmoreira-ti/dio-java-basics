package equipments.music;

public class Ipod implements MusicPlayer {
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
}
