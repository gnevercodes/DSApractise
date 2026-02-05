package timeComplexity.lambdafunc;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lamda {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        // arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);

        arr.forEach(fun);
        lamda one = new lamda();
        one.go();
    }

    int sum(int a, int b) {
        return a + b;
    }

    @Deprecated
    public void go() {
        System.out.println("annotations example on : Depricated ");
    }
}
