
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

    public int remove() throws Exception {
        //edge case
        if (isEmpty()) {
            throw new Exception("queue is empty");

        }
        int removed = data[0];
        // this is where we shift the data from 
        // here in queue , the first part of data gets removed ; 
        // so we remove it and shift the index left by 1 ; 
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];

        }
        end--;
        return removed;

    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");

        }
        return data[0];

    }
}
