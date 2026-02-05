
public class orderAgnosticBinSearch {

    public static void main(String[] args) {
        int[] aray = {1, 2, 3, 4, 5, 6, 7, 78, 88, 99};
        int target = 2;
        int indexLocation = orderAgnosticBinarySearch(aray, target);
        if (indexLocation == -1) {
            System.out.println("index not found");
        } else {
            System.out.println("index found at" + indexLocation);
        }
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0; // indexes 
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }
            if (isAsc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else { // DESCENDING 
                if (target > arr[middle]) {
                    end = middle - 1;

                } else {
                    start = middle + 1;

                }

            }
        }
        return -1;
    }
}
