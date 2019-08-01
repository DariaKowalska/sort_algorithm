package java.pl.algorithms;

import java.util.Random;

public class BubbleSort {

    public static void bubbleSort(int[] tab) {
        boolean isSwaped;

        do {
            isSwaped = false;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    isSwaped = true;
                    int temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                }
            }
        } while (isSwaped);
    }

    public static void main(String[] args) {
        int[] tab = new int[20];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }
        printTable(tab);
        System.out.println();
        bubbleSort(tab);
        printTable(tab);
    }

    public static void printTable(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
