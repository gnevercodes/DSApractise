
public class questionsRecursion {

    public static void main(String[] args) {
        int ans = fibonacciNumber(4);
        System.out.println(ans);

    }

    // # question 1.  find nth fibonacci sumber. 0,1,1,2,3,5,8,  ..
    static int fibonacciNumber(int n) {

        if (n < 2) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);

    }
    // # question 2
}
