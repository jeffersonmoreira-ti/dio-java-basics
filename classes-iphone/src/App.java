import equipments.internet.Browser;
import equipments.music.Ipod;
import equipments.phone.MotoQ;
import factory.iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {

        Browser browser = new Browser();
        Ipod ipod = new Ipod();
        MotoQ motoQ = new MotoQ();
        Iphone iphone = new Iphone();

        browser.exibirPagina();
        browser.atualizarPagina();
        browser.adicionarNovaAba();

        ipod.selecionarMusica();
        ipod.tocar();
        ipod.pausar();

        motoQ.atender();
        motoQ.ligar();
        motoQ.iniciarCorreioVoz();


        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

    }
}
