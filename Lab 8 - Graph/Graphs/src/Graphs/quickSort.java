package Graphs;

public class quickSort {

    public void sort(int[] table) {
        quickSort(table, 0, table.length - 1);
    }
    int count = 0;

    private void quickSort(int[] table, int first, int last) {
        if (first < last) {
            int pivIndex = partition(table, first, last);
            quickSort(table, first, pivIndex - 1);
            quickSort(table, pivIndex + 1, last);
        }

    }

    private int partition(int[] table, int first, int last) {
        int pivot = table[first];
        int up = first;
        int down = last;
        do {

            while ((up < last) && ((table[up]) >= pivot)) {
                up++;
            }
            while ((table[down]) < pivot) {
                down--;
            }
            if (up < down) {
                swap(table, up, down);
            }
        } while (up < down);

        swap(table, first, down);

        return down;

    }

    private void swap(int[] table, int i, int j) {

        int temp = table[i];
        table[i] = table[j];
        table[j] = temp;
        count++;

    }
    // getting the number of movies

    public int counter() {
        return count;
    }

}
