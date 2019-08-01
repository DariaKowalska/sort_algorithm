package java.pl.algorithms;

import java.util.Random;

public class TestSort {

    public static void main(String[] args) {

        int[] tab = new int[100_000];

        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10000000);
        }

        int[] tab2 = tab.clone();

        long startTime = System.nanoTime();
        BubbleSort.bubbleSort(tab);
        long stopTime = System.nanoTime();

        System.out.printf("BubbleSort time: %d \n",
                (stopTime - startTime) / 1_000_000
        );

        startTime = System.nanoTime();
        CountSort.countSort(tab2);
        stopTime = System.nanoTime();

        System.out.printf("CounterSort time: %d \n",
                (stopTime - startTime) / 1_000_000
        );
    }
}
