
import java.util.*;
import java.util.Queue;

public class pracCustomStack {

    public static void main(String[] args) {

        Stack<Integer> one = new Stack<Integer>();
        one.push(1);

        System.out.println(one.contains(1));

        Queue<Integer> two = new LinkedList<>();
        two.add(3);
        System.out.println(two.peek());
    }
}
