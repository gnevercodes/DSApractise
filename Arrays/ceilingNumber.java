
public class ceilingNumber {

    public static void main(String[] args) throws Exception {
        int[] aray = {1, 2, 3, 4, 5, 6, 7, 78, 88, 99};
        int target = 80;
        int indexLocation = ceiling(aray, target);
        System.out.println(aray[indexLocation]);
    }

    static int ceiling(int[] arr, int target) {
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
        return start;
    }
}
