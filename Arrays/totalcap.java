
public class totalcap {

    public static void main(String[] args) {
        int[][] variable2 = new int[][]{{1, 2, 3, 3}, {4, 5, 6, 9}};
        int target = 2;
        int[] result = twoDimensions(variable2, target);
        for (int i = 0; i < result.length - 1; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] twoDimensions(int[][] arrs, int target) {
        for (int row = 0; row < arrs.length; row++) {
            for (int col = 0; col < arrs[row].length; col++) {
                if (arrs[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
