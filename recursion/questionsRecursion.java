
public class questionsRecursion {

    public static void main(String[] args) {
        // int ans = fibonacciNumber(4);
        // System.out.println(ans);
        int[] arrays = {1, 2, 3, 4, 5, 6, 8, 10};
        int target = 6;
        int start = 0;
        int end = arrays.length - 1;
        int ans2 = binarySearchRecursion(arrays, target, start, end);
        System.out.println(ans2);

    }

    // # question 1.  find nth fibonacci sumber. 0,1,1,2,3,5,8,  ..
    static int fibonacciNumber(int n) {

        if (n < 2) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);

    }

    // # question 2
    static int binarySearchRecursion(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // # edge case 
        }
        int middle = start + (end - start) / 2;

        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] > target) {
            return binarySearchRecursion(arr, target, start, middle - 1);
        } else {
            return binarySearchRecursion(arr, target, middle + 1, end);
        }

    }
}
