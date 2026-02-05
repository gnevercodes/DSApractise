
import java.util.ArrayList;

public class arraylistcomp {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);
        // type is a wrapper class only . 
        ArrayList<ArrayList<Integer>> anotherList = new ArrayList<>();

        // initialization 
        for (int i = 0; i < 4; i++) {
            anotherList.add(new ArrayList<>());

        }
    }
}
