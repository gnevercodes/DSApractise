
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class inbuiltExamples {

    public static void main(String[] args) {

        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(45);
        // stack.push(23);
        // System.out.println(stack.pop()); // last inserted is the first one to be removed . 
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        Queue<Integer> queue = new LinkedList<>(); // queue is not available; 
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        Deque<Integer> deque = new ArrayDeque<>();

    }
}
