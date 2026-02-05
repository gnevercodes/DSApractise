
import java.util.Arrays;
// :

// Best case: O(n) (when the array is already sorted; only one pass needed)
// Worst case: O(n²) (when the array is sorted in reverse order)
// Average case: O(n²)
// The space complexity is O(1), since it sorts the array in place and uses only a constant amount of extra memory.
public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSorting(int[] arr) {
        // run the steps n-1 times.
        // * to check if the value give is swapped or not if swapped no need to traverse it.
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;  // setting the swap to false; 
            for (int j = 1; j <= arr.length - i - 1; j++) {
                // swapping here
                if (arr[j] < arr[j - 1]) { // swap condition to check if the prev num is bigger than the next one. 
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}

// ! sorting without recursion : NOTES
/* 
   * in every step we compare the first with the adjacent if greater
   * then we perform swap. 
   * 
   * why ? 
   * with the first pass , the largest element comes to the corner. 
   * best case is O(n)
   * worst case is O(nsquared); 
   * we consider the worst case. 
   * 
   * Stable sorting algorithm : order should be same when the value is same
   * if there exists duplicates , and even the occurance of those duplicates are in order then it is said to be as a stable sorting. 
 */
