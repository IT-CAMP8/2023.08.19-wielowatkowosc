package pl.comarch.camp.it.wiewlowatkowsc.executors;

public class Watek implements Runnable {

    private int threadNumber;

    public Watek(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("Watek " + this.threadNumber + " i: " + i);
        }
    }
}
