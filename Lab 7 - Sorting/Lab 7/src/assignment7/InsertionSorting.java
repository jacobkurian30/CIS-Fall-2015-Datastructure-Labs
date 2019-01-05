package assignment7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jacob
 */
public class InsertionSorting {
    int count;
    public void insertionSort(int[] array) {
        Scanner input = new Scanner(System.in);
     
        /*
         The comparison counter
         */
        count = 0;
        int currentIndex = 1;
        int finalIndex = array.length - 1;
        /*
         The first while will make the array with one index
         And it willl slowly incremented upto the orginal index 
         whic is length of the array -1.
         */
        while (currentIndex < array.length) {
            if (array.length == 0) {
                System.out.println("No camparision");
            }
            /*
             This loop will allow to do thw comparrison with element and
             swap the element, if it is necessary
             */
            while (array[currentIndex] < array[currentIndex - 1]) {
                // This the count incrementation
                count++;

                // Creating a temperary variable to store the value of the current Index
                int tempValue = array[currentIndex];
                // Sapping the values
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = tempValue;
                // Putting the necessary restriction to avoid the null pointer error
                  /*
                 This messsage will show thw user what values are swapping
                 */
                if (currentIndex > 1) {
                    currentIndex = currentIndex - 1;
                }
            }
            /*
             This is related to the first while loop
             Doing the incrementation of array
             */
            currentIndex = currentIndex + 1;
        }
      
    }
public int counter(){
return count;
}
    
}
