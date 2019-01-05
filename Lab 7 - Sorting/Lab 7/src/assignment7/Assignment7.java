package assignment7;
// Jacob Kurian
//11/14/2015
//Lab 08
//Sorting Algorithm
import java.util.Random;
import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key;

        do {
            menu();
            System.out.print("Press the a key to choose a function: ");
            key = input.nextInt();
            switch (key) {
                case 1: {
                    System.out.print("Enter the size of the array: ");
                    int arraySize = input.nextInt();
                    // creating object to call the method from merge sort class
                    mergeSort demo = new mergeSort();
                    //creating an array
                    int[] array = new int[arraySize];
                    Random RandomInt = new Random();
                    //Creating random numbers to store
                    for (int x = 0; x < array.length; x++) {
                        int number = RandomInt.nextInt(5000);
                        array[x] = number;
                    }
                    //Displaying unsorted array
                    System.out.println("Unsorted Array");
                    System.out.println("===============");
                    for (int x = 0; x < array.length; x++) {
                        System.out.print(array[x] + "  ");
                    }
                    /*
                     Calling the 'mergeSorting' method from the class mergeSort
                     This methods will sort the numbers
                     */
                    demo.mergeSorting(array);
                    //Displaying sorted array
                    System.out.println("\nSorter Array");
                    System.out.println("===============");
                    for (int x = 0; x < array.length; x++) {
                        System.out.print(array[x] + "  ");
                    }
                    System.out.println("\n");
                    //Displaying the totals moves that took place in merge sort
                    System.out.println("Merge Sort Moves: " + demo.counter());
                    break;
                }
                case 2: {
                    //Creating an object from quickSort class to call meethods from that class
                    quickSort demo = new quickSort();

                    System.out.print("Enter the size of the array: ");
                    int arraySize = input.nextInt();
                    //Creaing an array to store numbers
                    int[] table = new int[arraySize];
                    // Creating randon numbers
                    Random RandomInt = new Random();
                    for (int x = 0; x < table.length; x++) {
                        int number = RandomInt.nextInt(5000);
                        table[x] = number;
                    }
                    //Displaying unsorted array
                    System.out.println("UnSorted Array");
                    System.out.println("==============");
                    for (int x = table.length - 1; x >= 0; x--) {
                        System.out.print(table[x] + "  ");
                    }
                    // Calling the method sort from the quicksort class.
                    // This will sort the numbers in quick sort algorithem
                    demo.sort(table);
                    //Displaying the the sorted way
                    System.out.println("\nSorted Array");
                    System.out.println("=============");
                    for (int x = table.length - 1; x >= 0; x--) {
                        System.out.print(table[x] + "  ");
                    }
                    //Displaying the totals moves that took place in quick sort

                    System.out.println("\nMoves In Quik Sort: " + demo.counter());
                    break;
                }
                case 3: {
                    // Creating an object to call the methods from the insertion method
                    InsertionSorting demo = new InsertionSorting();

                    System.out.print("Enter the size of the array: ");
                    int arraySize = input.nextInt();
                    //Creatinf an array
                    int[] array = new int[arraySize];
                    Random RandomInt = new Random();
                    //Creting random numbers
                    for (int x = 0; x < array.length; x++) {
                        int number = RandomInt.nextInt(5000);
                        array[x] = number;
                    }
                    /*
                     Dispalying the unsorted array
                     */
                    System.out.println("Unsorted Array");
                    System.out.println("===============");
                    for (int x = 0; x < array.length; x++) {
                        System.out.print(array[x] + "  ");
                    }
                    demo.insertionSort(array);
                    System.out.println("\nSorted Array");
                    System.out.println("=============");
                    //Displaying sorted array
                    for (int x = 0; x < array.length; x++) {
                        System.out.print(array[x] + "  ");
                    }
                      //Displaying the totals moves that took place in Insertion sort
                    System.out.println("\nMoves in Insertion Sort :" + demo.counter());
                    System.out.println("\n-----------------------------------------");
                    break;
                }
                case 4: {
                    /*
                    This is mainly to sort the numbers using quicksort, insertion sort
                    and mergesort. The array size will be 2048, 4096, 8192, and 16384
                    For each size  in each sorting algorithm the operation repeat for
                    10 times and store the values 
                         */

                  //-----------------------------Quick Sort------------------------------
                    
                    System.out.println("*************Quick Sort****************");

                    int Size1 = 2048;
                    int Size2 = 4096;
                    int Size3 = 8192;
                    int Size4 = 16384;
                    /*
                    The porting of the code creating the a array that is 2048 long
                    And reapeat that 10 times, then store the number of moves that 
                    quick sort algorithm takes to sort it.
                    */
                    int[] quickArrayMoves1 = new int[10];
                    int quickSum1 = 0;
                    int quickMax1 = 0;
                    int quickMin1 = 0;
                    int temp = 0;
                    int temp2;
// -----------------------------size Quick 2048
                    for (int y = 0; y < 10; y++) {
                        quickSort demo1 = new quickSort();
                        int[] array = new int[Size1];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.sort(array);
                        quickArrayMoves1[y] = demo1.counter();
                    }
                    quickMin1 = quickArrayMoves1[0];
                    System.out.println("\nNumber of Moves");
                    for (int y = 0; y < 10; y++) {
                        quickSum1 = quickSum1 + quickArrayMoves1[y];
                        System.out.print(quickArrayMoves1[y] + " ");
                        if (temp < quickArrayMoves1[y]) {
                            quickMax1 = quickArrayMoves1[y];
                            temp = quickArrayMoves1[y];
                        }
//                        // --- Minimum
                        if (quickMin1 > quickArrayMoves1[y]) {
                            quickMin1 = quickArrayMoves1[y];
                            // temp2 = quickArrayMoves1[y];
                        }
                    }
                    System.out.println("\nMaximum " + quickMax1 + " Minimum " + quickMin1 + " sum  " + quickSum1);

                    //------- Quick Sort: Size = 4096
                    /*
                    The porting of the code creating the a array that is 4096 long
                    And reapeat that 10 times, then store the number of moves that 
                    quick sort algorithm takes to sort it.
                    */
                    int[] quickArrayMoves2 = new int[10];
                    int quickSum2 = 0;
                    int quickMax2 = 0;
                    int quickMin2 = 0;
                    int temp3 = 0;
                    int temp4;
                    for (int y = 0; y < 10; y++) {
                        quickSort demo1 = new quickSort();
                        int[] array = new int[Size2];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.sort(array);
                        quickArrayMoves2[y] = demo1.counter();

                    }
                    System.out.println("\nNumber of Moves ");
                    quickMin2 = quickArrayMoves2[0];
                    // System.out.println("\n");
                    for (int y = 0; y < 10; y++) {
                        quickSum2 = quickSum2 + quickArrayMoves2[y];
                        System.out.print(quickArrayMoves2[y] + " ");
                        if (temp3 < quickArrayMoves2[y]) {
                            quickMax2 = quickArrayMoves2[y];
                            temp3 = quickArrayMoves2[y];
                        }
//                        // --- Minimum
                        if (quickMin2 > quickArrayMoves2[y]) {
                            quickMin2 = quickArrayMoves2[y];
                            // temp4 = quickArrayMoves2[y];
                        }
                    }

                    System.out.println("\nMaximum " + quickMax2 + " Minimum " + quickMin2 + " sum  " + quickSum2);

                    //-------------------8192
                    /*
                    The porting of the code creating the a array that is 8192 long
                    And reapeat that 10 times, then store the number of moves that 
                    quick sort algorithm takes to sort it.
                    */
                    int[] quickArrayMoves3 = new int[10];
                    int quickSum3 = 0;
                    int quickMax3 = 0;
                    int quickMin3 = 0;
                    int temp5 = 0;
                    int temp6 = 0;
                    for (int y = 0; y < 10; y++) {
                        quickSort demo1 = new quickSort();
                        int[] array = new int[Size3];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.sort(array);
                        quickArrayMoves3[y] = demo1.counter();

                    }
                    quickMin3 = quickArrayMoves3[0];
                    System.out.println("\nNumber of Moves ");

                    //System.out.println("\n");
                    for (int y = 0; y < 10; y++) {
                        quickSum3 = quickSum3 + quickArrayMoves3[y];
                        System.out.print(quickArrayMoves3[y] + " ");
                        if (temp5 < quickArrayMoves3[y]) {
                            quickMax3 = quickArrayMoves3[y];
                            temp5 = quickArrayMoves3[y];
                        }
//                        // --- Minimum
                        if (quickMin3 > quickArrayMoves3[y]) {
                            quickMin3 = quickArrayMoves3[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                    System.out.println("\nMaximum " + quickMax3 + " Minimum " + quickMin3 + " sum " + quickSum3);

                    // ---------------------QuicSort 16,384
                    /*
                    The porting of the code creating the a array that is 16384 long
                    And reapeat that 10 times, then store the number of moves that 
                    quick sort algorithm takes to sort it.
                    */
                    int[] quickArrayMoves4 = new int[10];
                    int quickSum4 = 0;
                    int quickMax4 = 0;
                    int quickMin4 = 0;
                    int temp7 = 0;
                    for (int y = 0; y < 10; y++) {
                        quickSort demo1 = new quickSort();
                        int[] array = new int[Size4];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.sort(array);
                        quickArrayMoves4[y] = demo1.counter();
                    }
                    quickMin4 = quickArrayMoves4[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        quickSum4 = quickSum4 + quickArrayMoves4[y];
                        System.out.print(quickArrayMoves4[y] + " ");
                        if (temp7 < quickArrayMoves4[y]) {
                            quickMax4 = quickArrayMoves4[y];
                            temp7 = quickArrayMoves4[y];
                        }
//                        // --- Minimum
                        if (quickMin4 > quickArrayMoves4[y]) {
                            quickMin4 = quickArrayMoves4[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                    System.out.println("\nMaximum " + quickMax4 + "  Minimum " + quickMin4 + " sum " + quickSum4);
                    // --------------Inserion Sort (2048)
                    /*
                    The porting of the code creating the a array that is 2048 long.
                    Then sort the array using insertion algorithm and reapeat that 10 times,
                    then store the number of moves that 
                    insertion-sort algorithm takes to sort it.
                    */
                    System.out.println("\n***************Insertion Sort****************");
                    int[] insertionMovies1 = new int[10];
                    int insertSum1 = 0;
                    int insertMax1 = 0;
                    int insertMin1 = 0;
                    int temp8 = 0;
                    for (int y = 0; y < 10; y++) {
                        InsertionSorting demo1 = new InsertionSorting();
                        int[] array = new int[Size1];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.insertionSort(array);
                        insertionMovies1[y] = demo1.counter();
                    }
                    insertMin1 = insertionMovies1[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        insertSum1 = insertSum1 + insertionMovies1[y];
                        System.out.print(insertionMovies1[y] + " ");
                        if (temp8 < insertionMovies1[y]) {
                            insertMax1 = insertionMovies1[y];
                            temp8 = insertionMovies1[y];
                        }
//                        // --- Minimum
                        if (insertMin1 > insertionMovies1[y]) {
                            insertMin1 = insertionMovies1[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                    System.out.println("\nMaximum " + insertMax1 + "  Minimum " + insertMin1 + " sum " + insertSum1);
                    // -------------Size InserionSort 4096
                    
                     /*
                    The porting of the code creating the a array that has the size of 4096 .
                    Then sort the array using insertion algorithm and reapeat that 10 times,
                    then store the number of moves that 
                    insertion-sort algorithm takes to sort it.
                    */
                    int[] insertionMovies2 = new int[10];
                    int insertSum2 = 0;
                    int insertMax2 = 0;
                    int insertMin2 = 0;
                    int temp9 = 0;
                    for (int y = 0; y < 10; y++) {
                        InsertionSorting demo1 = new InsertionSorting();
                        int[] array = new int[Size2];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.insertionSort(array);
                        insertionMovies2[y] = demo1.counter();
                    }
                    insertMin2 = insertionMovies2[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        insertSum2 = insertSum2 + insertionMovies2[y];
                        System.out.print(insertionMovies2[y] + " ");
                        if (temp9 < insertionMovies2[y]) {
                            insertMax2 = insertionMovies2[y];
                            temp9 = insertionMovies2[y];
                        }
//                        // --- Minimum
                        if (insertMin2 > insertionMovies2[y]) {
                            insertMin2 = insertionMovies2[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                    System.out.println("\nMaximum " + insertMax2 + "  Minimum " + insertMin2 + " sum " + insertSum2);
                    //-----------------------Inserion sort Size ;8192
                     /*
                    The porting of the code creating the a array that has the size of 8192 .
                    Then sort the array using insertion algorithm and reapeat that 10 times,
                    then store the number of moves that 
                    insertion-sort algorithm takes to sort it.
                    */
                    int[] insertionMovies3 = new int[10];
                    int insertSum3 = 0;
                    int insertMax3 = 0;
                    int insertMin3 = 0;
                    int temp10 = 0;
                    for (int y = 0; y < 10; y++) {
                        InsertionSorting demo1 = new InsertionSorting();
                        int[] array = new int[Size3];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.insertionSort(array);
                        insertionMovies3[y] = demo1.counter();
                    }
                    insertMin3 = insertionMovies3[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        insertSum3 = insertSum3 + insertionMovies3[y];
                        System.out.print(insertionMovies3[y] + " ");
                        if (temp10 < insertionMovies3[y]) {
                            insertMax3 = insertionMovies3[y];
                            temp10 = insertionMovies3[y];
                        }
//                        // --- Minimum
                        if (insertMin3 > insertionMovies3[y]) {
                            insertMin3 = insertionMovies3[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                    System.out.println("\nMaximum " + insertMax3 + "  Minimum " + insertMin3 + " sum " + insertSum3);
//-----------------------------Insertion Size 16384
                     /*
                    The porting of the code creating the a array that has the size of 16384.
                    Then sort the array using insertion algorithm and reapeat that 10 times,
                    then store the number of moves that 
                    insertion-sort algorithm takes to sort it.
                    */
                    int[] insertionMovies4 = new int[10];
                    int insertSum4 = 0;
                    int insertMax4 = 0;
                    int insertMin4 = 0;
                    int temp11 = 0;
                    for (int y = 0; y < 10; y++) {
                        InsertionSorting demo1 = new InsertionSorting();
                        int[] array = new int[Size4];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.insertionSort(array);
                        insertionMovies4[y] = demo1.counter();
                    }
                    insertMin4 = insertionMovies4[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        insertSum4 = insertSum4 + insertionMovies4[y];
                        System.out.print(insertionMovies4[y] + " ");
                        if (temp11 < insertionMovies4[y]) {
                            insertMax4 = insertionMovies4[y];
                            temp11 = insertionMovies4[y];
                        }
//                        // --- Minimum
                        if (insertMin4 > insertionMovies4[y]) {
                            insertMin4 = insertionMovies4[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                                        // Displaying the maximum, minimum and the sum of the total movies
                    System.out.println("\nMaximum " + insertMax4 + "  Minimum " + insertMin4 + " sum " + insertSum4);

                    //-------------------------------Merge Sort Size: 2048
                     /*
                    The porting of the code creating the a array that has the size of 2048 .
                    Then sort the array using merge algorithm and reapeat that 10 times,
                    then store the number of moves that merge-sort algorithm takes to sort it.
                    */
                    System.out.println("\n *********** Merge Sort **************");
                    int[] MergeMovies1 = new int[10];
                    int mergeSum1 = 0;
                    int mergeMax1 = 0;
                    int mergeMin1 = 0;
                    int temp12 = 0;
                    for (int y = 0; y < 10; y++) {
                        mergeSort demo1 = new mergeSort();
                        int[] array = new int[Size1];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.mergeSorting(array);
                        MergeMovies1[y] = demo1.counter();
                    }
                    mergeMin1 = MergeMovies1[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        mergeSum1 = mergeSum1 + MergeMovies1[y];
                        System.out.print(MergeMovies1[y] + " ");
                        if (temp12 < MergeMovies1[y]) {
                            mergeMax1 = MergeMovies1[y];
                            temp12 = MergeMovies1[y];
                        }
//                        // --- Minimum
                        if (mergeMin1 > MergeMovies1[y]) {
                            mergeMin1 = MergeMovies1[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                                        // Displaying the maximum, minimum and the sum of the total movies

                    System.out.println("\nMaximum " + mergeMax1 + "  Minimum " + mergeMin1 + " sum " + mergeSum1);

                    // ---------- Merge Sort 4096
                     /*
                    The porting of the code creating the a array that has the size of 4096 .
                    Then sort the array using merge algorithm and reapeat that 10 times,
                    then store the number of moves that merge-sort algorithm takes to sort it.
                    */
                    int[] MergeMovies2 = new int[10];
                    int mergeSum2 = 0;
                    int mergeMax2 = 0;
                    int mergeMin2 = 0;
                    int temp13 = 0;
                    for (int y = 0; y < 10; y++) {
                        mergeSort demo1 = new mergeSort();
                        int[] array = new int[Size2];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.mergeSorting(array);
                        MergeMovies2[y] = demo1.counter();
                    }
                    mergeMin2 = MergeMovies2[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        mergeSum2 = mergeSum2 + MergeMovies2[y];
                        System.out.print(MergeMovies2[y] + " ");
                        if (temp13 < MergeMovies2[y]) {
                            mergeMax2 = MergeMovies2[y];
                            temp13 = MergeMovies2[y];
                        }
//                        // --- Minimum
                        if (mergeMin2 > MergeMovies2[y]) {
                            mergeMin2 = MergeMovies2[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                                        // Displaying the maximum, minimum and the sum of the total movies
                    System.out.println("\nMaximum " + mergeMax2 + "  Minimum " + mergeMin2 + " sum " + mergeSum2);
                    //-----------------------Merge 8192
                     /*
                    The porting of the code creating the a array that has the size of 8192 .
                    Then sort the array using merge algorithm and reapeat that 10 times,
                    then store the number of moves that merge-sort algorithm takes to sort it.
                    */
                    int[] MergeMovies3 = new int[10];
                    int mergeSum3 = 0;
                    int mergeMax3 = 0;
                    int mergeMin3 = 0;
                    int temp14 = 0;
                    for (int y = 0; y < 10; y++) {
                        mergeSort demo1 = new mergeSort();
                        int[] array = new int[Size3];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.mergeSorting(array);
                        MergeMovies3[y] = demo1.counter();
                    }
                    mergeMin3 = MergeMovies3[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        mergeSum3 = mergeSum3 + MergeMovies3[y];
                        System.out.print(MergeMovies3[y] + " ");
                        if (temp14 < MergeMovies3[y]) {
                            mergeMax3 = MergeMovies3[y];
                            temp14 = MergeMovies3[y];
                        }
//                        // --- Minimum
                        if (mergeMin3 > MergeMovies3[y]) {
                            mergeMin3 = MergeMovies3[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                    // Displaying the maximum, minimum and the sum of the total movies
                    System.out.println("\nMaximum " + mergeMax3 + "  Minimum " + mergeMin3 + " sum " + mergeSum3);

                    //----------------------Merge size 16,384
                     /*
                    The porting of the code creating the a array that has the size of 16382 .
                    Then sort the array using merge algorithm and reapeat that 10 times,
                    then store the number of moves that merge-sort algorithm takes to sort it.
                    */
                    int[] MergeMovies4 = new int[10];
                    int mergeSum4 = 0;
                    int mergeMax4 = 0;
                    int mergeMin4 = 0;
                    int temp15 = 0;
                    for (int y = 0; y < 10; y++) {
                        mergeSort demo1 = new mergeSort();
                        int[] array = new int[Size4];
                        Random RandomInt = new Random();
                        for (int x = 0; x < array.length; x++) {
                            int number = RandomInt.nextInt(5000);
                            array[x] = number;
                        }
                        demo1.mergeSorting(array);
                        MergeMovies4[y] = demo1.counter();
                    }
                    mergeMin4 = MergeMovies4[0];
                    System.out.println("\nNumber of Moves ");
                    for (int y = 0; y < 10; y++) {
                        mergeSum4 = mergeSum4 + MergeMovies4[y];
                        System.out.print(MergeMovies4[y] + " ");
                        if (temp15 < MergeMovies4[y]) {
                            mergeMax4 = MergeMovies4[y];
                            temp15 = MergeMovies4[y];
                        }
//                        // --- Minimum
                        if (mergeMin4 > MergeMovies4[y]) {
                            mergeMin4 = MergeMovies4[y];
                            // temp6 = quickArrayMoves3[y];
                        }
                    }
                    System.out.println("\nMaximum " + mergeMax4 + "  Minimum " + mergeMin4 + " sum " + mergeSum4);
                                        // Creating a table to display the average, max and min values.

                    System.out.println("\n                      Comparison Table ");
                    System.out.println("===========================================================================");
                    System.out.print("Sorting Type|  |Array Size |  | Average |  | Highest Value |  |Minimum Value |");
                    System.out.println("\n===========================================================================");
                    System.out.println("\nQuick SOrt       " + Size1 + "            " + quickSum1 / 10 + "              " + quickMax1 + "           " + quickMin1);
                    System.out.println("\nQuick SOrt       " + Size2 + "            " + quickSum2 / 10 + "             " + quickMax2 + "          " + quickMin2);
                    System.out.println("\nQuick SOrt       " + Size3 + "            " + quickSum3 / 10 + "             " + quickMax3 + "          " + quickMin3);
                    System.out.println("\nQuick SOrt       " + Size4 + "           " + quickSum4 / 10 + "              " + quickMax4 + "         " + quickMin4);
                    System.out.println("============================================================================");
                    System.out.println("\nMerge Sort       " + Size1 + "            " + mergeSum1 / 10 + "             " + mergeMax1 + "            " + mergeMin1);
                    System.out.println("\nMerge Sort       " + Size2 + "            " + mergeSum2 / 10 + "             " + mergeMax2 + "            " + mergeMin2);
                    System.out.println("\nMerge Sort       " + Size3 + "           " + mergeSum3 / 10 + "             " + mergeMax3 + "          " + mergeMin3);
                    System.out.println("\nMerge Sort       " + Size4 + "           " + mergeSum4 / 10 + "            " + mergeMax4 + "          " + mergeMin4);
                    System.out.println("=============================================================================");
                    System.out.println("\nInsertion SOrt   " + Size1 + "           " + insertSum1 / 10 + "           " + insertMax1 + "         " + insertMin1);
                    System.out.println("\nInsertion SOrt   " + Size2 + "           " + insertSum2 / 10 + "           " + insertMax2 + "        " + insertMin2);
                    System.out.println("\nInsertion SOrt   " + Size3 + "          " + insertSum3 / 10 + "          " + insertMax3 + "       " + insertMin3);
                    System.out.println("\nInsertion SOrt   " + Size4 + "         " + insertSum4 / 10 + "         " + insertMax4 + "        " + insertMin4);
                    System.out.println("=============================================================================");
                    
                    break;
                }
                
            }

        } while (key != 5);
        System.out.println("Thank you!");
    }

    public static void menu() {
        System.out.println("Press 1: To sort the random Number in 'Merge Sort'");
        System.out.println("Press 2: To sort the random Number in 'Quick Sort'");
        System.out.println("Press 3: To sort the random Number in 'Insertion Sort'");
        System.out.println("Press 4: To see the 'Comparison Table' between merge, quick and Insetion sort");
        System.out.println("Press 5: Quit");

    }
}
