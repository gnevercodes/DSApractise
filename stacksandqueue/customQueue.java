
public class customQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;  // creating a default size ; 

    int end = -1; // ! a pointer to traverse 

    public customQueue() { // if no size is given then we just call the second constructor with the default size 
        this(DEFAULT_SIZE);

    }

    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }
}
