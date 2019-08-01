package java.pl.algorithms;

import java.util.Random;

public class CountSort {
    
    public static void countSort(int[] tab) {
        int[] temp = new int[10000000];
        for (int i = 0; i < tab.length; i++) {
            temp[tab[i]]++;
        }

        int n = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int x = 0; x < temp[i]; x++) {
                tab[n] = i;
                n++;
            }
        }
    }

    public static void main(String[] args) {
        int[] tab = new int[20];

        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }

        BubbleSort.printTable(tab);
        System.out.println(" --- ");
        countSort(tab);
        BubbleSort.printTable(tab);
    }
}
