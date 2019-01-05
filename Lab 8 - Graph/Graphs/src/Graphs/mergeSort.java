package Graphs;

public class mergeSort {

    int count;

    public void mergeSorting(int[] array) {
        count = 0;
        if (array.length > 1) {
            int halfArray = array.length / 2;
            int[] left = new int[halfArray];

            int rightLength = array.length - halfArray;
            int[] right = new int[rightLength];
            // Creating left array
            System.arraycopy(array, 0, left, 0, halfArray);
            //creating right array
            System.arraycopy(array, halfArray, right, 0, (array.length - halfArray));
            for (int x = 0; x < left.length; x++) {
            }
            mergeSorting(left);
            mergeSorting(right);

            merging(array, left, right);
        }

    }

    private void merging(int[] array, int[] left, int[] right) {
        int iLeft = 0;
        int jRight = 0;
        int kMain = 0;
        /*
         This conditon will take the lowest values from the subarray to 
         insert in the main array
         */
        while (iLeft < left.length && jRight < right.length) {
            if (left[iLeft] < right[jRight]) {
                /*
                 putting a conding that if the number in the array and the subarray
                 are same don't count that as a move.
                 */
                if (array[kMain] != left[iLeft]) {
                    count = count + 1;
                }
                array[kMain] = left[iLeft];
                iLeft = iLeft + 1;

            } else {
                /*
                 putting a conding that if the number in the array and the subarray
                 are same don't count that as a move.
                 */
                if (array[kMain] != right[jRight]) {
                    count = count + 1;
                }
                array[kMain] = right[jRight];
                jRight = jRight + 1;
            }
            kMain = kMain + 1;
        }

        while (iLeft < left.length && kMain < array.length) {
            /*
             putting a conding that if the number in the array and the subarray
             are same don't count that as a move.
             */
            if (array[kMain] != left[iLeft]) {
                count = count + 1;
            }
            array[kMain] = left[iLeft];
            iLeft = iLeft + 1;
            kMain = kMain + 1;

        }

        while (jRight < right.length && kMain < array.length) {
            /*
             putting a conding that if the number in the array and the subarray
             are same don't count that as a move.
             */
            if (array[kMain] != right[jRight]) {
                count = count + 1;
            }
            array[kMain] = right[jRight];
            jRight = jRight + 1;
            kMain = kMain + 1;

        }
    }
// getting the total number of moves

    public int counter() {

        return count;
    }

}
