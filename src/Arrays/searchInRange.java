
public class searchInRange {

    // Search in Range means search for something in the index range of {X to Y }
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 4, 555, 5, 2, 55, 66, 878};
        int target = 66;
        boolean foundorNot = linearSearch(arr, target, 1, 5);
        System.out.println(foundorNot);
    }

    public static boolean linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) { // return will come out of the function . 
            return false;
        }
        for (int index = start; index <= end; index++) {
            // int element = arr[index];
            if (arr[index] == target) {
                return true;
            }
        }
        return false; // Add this line
    }
}
