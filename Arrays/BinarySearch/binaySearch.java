
public class binaySearch {

    public static void main(String[] args) throws Exception {
        int[] aray = {1, 2, 3, 4, 5, 6, 7, 78, 88, 99};
        int target = 2;
        int indexLocation = binary(aray, target);
        if (indexLocation == -1) {
            System.out.println("index not found");
        } else {
            System.out.println("index found at" + indexLocation);
        }
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find middle 
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;

            } else if (target > arr[middle]) {
                start = middle + 1;

            } else {
                // target is at middle
                return middle;
            }

        }
        return -1;
    }
}
