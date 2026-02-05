package timeComplexity.ObjectCloning;

public class temp {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 4, 6};
        System.out.println(uniq(arr));
    }

    static int uniq(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;

        }
        return unique;
    }

}
