
public class linearSearch {

    public static void main(String[] args) {
        // Linear Search
        // Start from start and search untill you find . 
        int[] nums = {2, 33, 445, 12, 134, 18, 100};
        boolean ans = linearSearch(nums, 22);
        System.out.println("target found at index " + ans);

    }

    // Searching : return the index if the item is found ; 
    public static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) { // return will come out of the function . 
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        return false; // Add this line
    }
}
