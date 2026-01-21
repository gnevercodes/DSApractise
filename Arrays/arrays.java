
import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {

        // syntax
        // declaration of an array ; (CompileTime)
        // name is getting defined in the stack . 
        //  Declaration object is created in heap and then being assigned. (RunTime) // dynamic memory allocation(allocation at runtime)
        // [ , , , , , , , , , ] continuous mem location ( JVM decides it)
        // heap objects are not continuous . 
        // DMA arraay obj in java may not be continuous .
        // null is a special literal .
        // Each element in array is an object. 
        // so we can say it can be non continuous too.
        // array is a collection of reference variables
        int[] arr = new int[5];
        java.util.Scanner in = new java.util.Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();

        }

        System.out.println(Arrays.toString(arr));

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }

        // string are immutable , arrays are mutable. 
        // 2D arrays 
        int[][] twoarr = {
            {1, 2, 3},
            {4, 5},
            {
                2, 3, 4, 45
            }
        };  // column sizee is not needed. 

        // input ; 
        for (int row = 0; row < twoarr.length; row++) {
            for (int col = 0; col < twoarr[row].length; col++) {
                twoarr[row][col] = in.nextInt();
            }
            System.out.println();
        }

        for (int row = 0; row < twoarr.length; row++) {
            System.out.println(Arrays.toString(twoarr[row]));
        }
        for (int[] a : twoarr) {
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}
