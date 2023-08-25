package pl.comarch.camp.it.wiewlowatkowsc.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        /*ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        singleExecutor.submit(new Watek(1));
        singleExecutor.submit(new Watek(2));
        singleExecutor.submit(new Watek(3));
        singleExecutor.submit(new Watek(4));
        singleExecutor.submit(new Watek(5));
        singleExecutor.submit(new Watek(6));

        singleExecutor.shutdown();*/

        /*ExecutorService multiExecutor = Executors.newFixedThreadPool(4);

        multiExecutor.submit(new Watek(1));
        multiExecutor.submit(new Watek(2));
        multiExecutor.submit(new Watek(3));
        multiExecutor.submit(new Watek(4));
        multiExecutor.submit(new Watek(5));
        multiExecutor.submit(new Watek(6));
        multiExecutor.submit(new Watek(7));

        multiExecutor.shutdown();*/

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new Watek(1), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(2), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(3), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(4), 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(5), 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(6), 15, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(7), 20, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(8), 30, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
