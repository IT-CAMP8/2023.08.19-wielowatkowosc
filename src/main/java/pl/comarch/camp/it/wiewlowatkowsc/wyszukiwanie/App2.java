package pl.comarch.camp.it.wiewlowatkowsc.wyszukiwanie;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public final static List<Integer> partialResults = new ArrayList<>();
    public static void main(String[] args) {
        int[] tab = new int[1000000000];
        int threadsNumber = 11;
        Thread[] threads = new Thread[threadsNumber];

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < threadsNumber; i++) {
            threads[i] = new Thread(new MinFinder(tab, i * (tab.length / threadsNumber), (i + 1) * (tab.length / threadsNumber)));
            threads[i].start();
        }

        try {
            for(Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("zepsulo sie !!!");
        }

        int globalMin = partialResults.get(0);
        for(int element : partialResults) {
            if(element < globalMin) {
                globalMin = element;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(globalMin);
        System.out.println(endTime - startTime);
    }
}
