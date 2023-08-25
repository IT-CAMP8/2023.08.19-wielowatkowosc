package pl.comarch.camp.it.wiewlowatkowsc.pi;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public final static List<Long> partialResults = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        long allPoints = 20000000000L;
        long startTime = System.currentTimeMillis();
        int threadsNumber = 14;
        Thread[] threads = new Thread[threadsNumber];

        for(int i = 0; i < threadsNumber; i++) {
            threads[i] = new Thread(new PointsGenerator(allPoints/threadsNumber));
            threads[i].start();
        }

        for(Thread thread : threads) {
            thread.join();
        }
        long pointsInCircleSum = 0;
        for(long element : partialResults) {
            pointsInCircleSum+=element;
        }
        double pi = 4.0 * pointsInCircleSum / allPoints;
        long endTime = System.currentTimeMillis();
        System.out.println(pi);
        System.out.println(endTime - startTime);
    }
}
