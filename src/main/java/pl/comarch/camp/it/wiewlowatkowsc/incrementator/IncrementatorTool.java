package pl.comarch.camp.it.wiewlowatkowsc.incrementator;

public class IncrementatorTool {
    public synchronized void increment() {
        App.counter++;
    }
}
