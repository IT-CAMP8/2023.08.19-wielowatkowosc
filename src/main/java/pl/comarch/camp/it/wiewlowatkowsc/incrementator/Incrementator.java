package pl.comarch.camp.it.wiewlowatkowsc.incrementator;

public class Incrementator implements Runnable {

    int threadNumber;
    IncrementatorTool incrementatorTool;

    public Incrementator(int threadNumber, IncrementatorTool incrementatorTool) {
        this.threadNumber = threadNumber;
        this.incrementatorTool = incrementatorTool;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            //System.out.println("Thread " + this.threadNumber + " increment !!");
            /*synchronized (App.lock) {
                App.counter++;
            }*/
            this.incrementatorTool.increment();
        }
    }

    /*private synchronized void increment() {
        App.counter++;
    }*/
}
