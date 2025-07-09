
import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, -4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // find the maximum item and swap with current index.
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapArray(arr, maxIndex, last);

        }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    private static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
