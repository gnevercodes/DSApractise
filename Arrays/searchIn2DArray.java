
public class searchIn2DArray {

    public static void main(String[] args) {
        int[][] twoDimenArray = {
            {2, 3, 4, 8},
            {55, 99, 11, 33},
            {33, 44, 111, 00}
        };
        int target = 4;
        int foundOrNot = searchIn2DArray.twoDimensional(twoDimenArray, target);
        System.out.println(foundOrNot);
        System.out.println(Integer.MIN_VALUE); // minimum values of every datatypes. 

        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);

    }

    public static int twoDimensional(int[][] arr, int target) {

        // how to find a max value in the two dimensional array . 
        // int max = Integer.MIN_VALUE ; and assign it the maximum everytime traversing . 
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return arr[row][col];
                }
            }

        }
        return -1;
    }
}
