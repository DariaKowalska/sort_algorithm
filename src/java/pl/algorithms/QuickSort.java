package java.pl.algorithms;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] tab = new int[20];

        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }

        BubbleSort.printTable(tab);
        quickSort(tab, 0, tab.length - 1);
        System.out.println(" --- ");
        BubbleSort.printTable(tab);

    }

    public static void quickSort(int[] table, int l, int r) {

        if (l < r) { // jeśli fragment dłuższy niż 1 element

            int i = dividedTable(table, l, r); // podziel i zapamiętaj punkt podziału
            quickSort(table, l, i - 1); // posortuj lewą część

            quickSort(table, i + 1, r); // posortuj prawą część

        }
    }

    /* wybiera element, który ma być użyty do podziału
      i przenosi wszystkie elementy mniejsze na lewo od
      tego elementu, a elementy większe lub równe, na prawo
      od wybranego elementu  */

    private static int dividedTable(int[] table, int l, int r) {
        int partitionIndex = choosePartitionPoint(l, r); // wybierz element, który posłuży do podziału tablicy
        int partitionValue = table[partitionIndex]; // zapamiętaj wartość elementu
        change(table, partitionIndex, r); // przenieś element podziału na koniec tablicy, aby sam nie brał udziału w podziale
        int actualPosition = l;

        // iteruj przez wszystkie elementy, jeśli element jest
        // mniejszy niż wartość elementu podziału dodaj go do "lewej" strony

        for (int i = l; i <= r - 1; i++) {
            if (table[i] < partitionValue) {
                change(table, i, actualPosition);
                actualPosition++;
            }
        }

        change(table, actualPosition, r); // wstaw element podziału we właściwe miejsce

        return actualPosition;
    }

    /**
     * podstawowa implementacja wyboru punktu podziału - wybiera element "środkowy" w tablicy
     **/
    private static int choosePartitionPoint(int l, int r) {
        return l + (r - l) / 2;
    }

    /**
     * zamienia miejscami elementy w komórkach i1, i2
     */

    private static void change(int[] table, int i1, int i2) {
        int temp = table[i1];
        table[i1] = table[i2];
        table[i2] = temp;
    }
}
