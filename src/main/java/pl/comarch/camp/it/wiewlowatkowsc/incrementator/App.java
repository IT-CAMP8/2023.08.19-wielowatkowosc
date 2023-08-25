package pl.comarch.camp.it.wiewlowatkowsc.incrementator;

public class App {
    public static int counter = 0;
    public final static Object lock = new Object();
    public static void main(String[] args) {
        IncrementatorTool it = new IncrementatorTool();
        Thread t1 = new Thread(new Incrementator(1, it));
        Thread t2 = new Thread(new Incrementator(2, it));
        Thread t3 = new Thread(new Incrementator(3, it));
        Thread t4 = new Thread(new Incrementator(4, it));
        Thread t5 = new Thread(new Incrementator(5, it));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            System.out.println(counter);
            t2.join();
            System.out.println(counter);
            t3.join();
            System.out.println(counter);
            t4.join();
            System.out.println(counter);
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Cos sie zepsulo !!!");
        }

        System.out.println(counter);
    }
}
