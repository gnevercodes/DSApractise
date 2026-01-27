
public class totalcap {

    public static void main(String[] args) throws Exception {
        int[] aray = {1, 2, 3, 4, 5, 6, 7, 78, 88, 99};
        int target = 4;

        int indexLocation = binary(aray, target); // given a static; 
        int indexLocation1 = linear(aray, target);
        System.out.println(indexLocation);
        System.out.println(indexLocation1);
        if (indexLocation == -1) {
            System.out.println("index not found");
        } else {
            System.out.println("index found at loction:" + indexLocation);
        }

    }

    public static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < target) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int linear(int[] arr, int target) {

        for (int i : arr) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // this part never exists if found ; 
    }
}
