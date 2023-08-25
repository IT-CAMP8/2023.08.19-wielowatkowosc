package pl.comarch.camp.it.wiewlowatkowsc;

public class App {
    public static void main(String[] args) {
        /*Thread watek1 = new Watek(1);
        Thread watek2 = new Watek(2);
        watek1.start();
        watek2.start();*/

        Thread lepszyWatek1 = new Thread(new LepszyWatek());
        Thread lepszyWatek2 = new Thread(new LepszyWatek());
        Thread lepszyWatek3 = new Thread(new LepszyWatek());
        Thread lepszyWatek4 = new Thread(new LepszyWatek());
        Thread lepszyWatek5 = new Thread(new LepszyWatek());
        Thread lepszyWatek6 = new Thread(new LepszyWatek());

        lepszyWatek1.start();
        lepszyWatek2.start();
        lepszyWatek3.start();
        lepszyWatek4.start();
        lepszyWatek5.start();
        lepszyWatek6.start();
    }
}
