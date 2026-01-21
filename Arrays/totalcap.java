
import java.util.Arrays;
import java.util.Scanner;

public class totalcap {

    public static void main(String[] args) {
        int[] arraynew = new int[5];
        Scanner newone = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arraynew[i] = newone.nextInt();

        }
        System.out.println(Arrays.toString(arraynew));

        System.out.println(FindMinValue(arraynew));
        System.out.println(Integer.MAX_VALUE);

    }

    public static int FindMinValue(int[] arr) {
        int minimulvalue = arr[0];

        for (int each : arr) {
            if (each < minimulvalue) {
                minimulvalue = each;
            }
        }
        return minimulvalue;

    }
}
