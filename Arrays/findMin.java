
public class findMin {
    // minimum in an array  . 

    public static void main(String[] args) {
        int[] arr = {22, 3, 33, 55, 667, 33, 9999};
        System.out.println(minimumOfArray(arr));
    }

    public static int minimumOfArray(int[] arr) {
        int minimumCurrently = arr[0]; // set anything and eventually if the number comes less than this , UPDATE
        for (int each : arr) {
            if (each < minimumCurrently) {
                minimumCurrently = each; // UPDATE the min value. 
            }

        }
        return minimumCurrently;

    }
}
