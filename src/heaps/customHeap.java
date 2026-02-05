
import java.util.*;

public class customHeap<T extends Comparable> {

    private ArrayList<T> list; // array initializer. 
    private int size = 0;
    private int ptr = 0;

    public customHeap() {
        list = new ArrayList<>();

    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void add(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

    }
}
