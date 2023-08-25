package pl.comarch.camp.it.wiewlowatkowsc.notify;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public final static Object communicationChannel = new Object();
    public static boolean notificationConfirmation = false;
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);

        executor.schedule(new Receiver(), 0, TimeUnit.SECONDS);
        executor.schedule(new Sender(), 5, TimeUnit.SECONDS);

        executor.shutdown();
    }
}
