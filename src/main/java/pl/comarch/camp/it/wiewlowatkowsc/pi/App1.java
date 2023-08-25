package pl.comarch.camp.it.wiewlowatkowsc.pi;

import java.util.Random;

public class App1 {
    public static void main(String[] args) {
        int allPoints = 2000000000;
        long startTime = System.currentTimeMillis();
        int pointsInCircle = 0;
        Random random = new Random();

        for(int i = 0; i < allPoints; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distance = Math.sqrt(x*x + y*y);

            if(distance <= 1) {
                pointsInCircle++;
            }
        }

        double pi = 4.0 * pointsInCircle / allPoints;
        long endTime = System.currentTimeMillis();
        System.out.println(pi);
        System.out.println(endTime - startTime);
    }
}
