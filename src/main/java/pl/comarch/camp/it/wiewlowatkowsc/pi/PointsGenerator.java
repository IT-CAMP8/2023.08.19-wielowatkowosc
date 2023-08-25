package pl.comarch.camp.it.wiewlowatkowsc.pi;

import pl.comarch.camp.it.wiewlowatkowsc.notify.App;

import java.util.Random;

public class PointsGenerator implements Runnable {

    private final long pointsToGenerate;

    public PointsGenerator(long pointsToGenerate) {
        this.pointsToGenerate = pointsToGenerate;
    }

    @Override
    public void run() {
        long pointsInCircle = 0;
        Random random = new Random();
        for(int i = 0; i < this.pointsToGenerate; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distance = Math.sqrt(x*x + y*y);

            if(distance <= 1) {
                pointsInCircle++;
            }
        }

        synchronized(App2.partialResults) {
            App2.partialResults.add(pointsInCircle);
        }
    }
}
