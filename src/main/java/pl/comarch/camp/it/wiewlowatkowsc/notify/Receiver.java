package pl.comarch.camp.it.wiewlowatkowsc.notify;

public class Receiver implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Odbiorca sie odpala !!!");
            System.out.println("Odbiorca czeka !!!");
            synchronized(App.communicationChannel) {
                while(!App.notificationConfirmation) {
                    App.communicationChannel.wait();
                }
            }
            System.out.println("Obdiorca odebral notyfikacje !!!");
        } catch (InterruptedException e) {
            System.out.println("zepsulo sie !!!");
        }
    }
}
