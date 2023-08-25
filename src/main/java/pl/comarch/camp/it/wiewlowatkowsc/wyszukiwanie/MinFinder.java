package pl.comarch.camp.it.wiewlowatkowsc.wyszukiwanie;

import pl.comarch.camp.it.wiewlowatkowsc.notify.App;

import java.util.Random;

public class MinFinder implements Runnable {

    private int[] tab;
    private int startIndex;
    private int endIndex;

    public MinFinder(int[] tab, int startIndex, int endIndex) {
        this.tab = tab;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = this.startIndex; i < this.endIndex; i++) {
            tab[i] = random.nextInt();
        }

        int min = tab[startIndex];
        for(int i = this.startIndex; i < this.endIndex; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }
        synchronized(App2.partialResults) {
            App2.partialResults.add(min);
        }
    }
}
