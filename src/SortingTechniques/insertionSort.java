
import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 1};
        insertionSorting(arr);

        System.out.println(Arrays.toString(arr));

    }
// * i<= arr.length-2; 

    static void insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
    }
}
