
public class circularQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;  // creating a default size ; 

    protected int end = 0; // ! a pointer to traverse 
    protected int front = 0;
    private int size = 0;

    public circularQueue() { // if no size is given then we just call the second constructor with the default size 
        this(DEFAULT_SIZE);

    }

    public circularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is emptly");

        }
        int removed = data[front];
        front = front % data.length;
        size--;
        return removed;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    // ! modulo operator and logic with traversal is not understood : 
    // TODO : learn this again and implement. 
    public void display() {
        if (isEmpty()) {
            System.out.println("the queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.println(data[i]);
            i++;
            i %= data.length;
        } while (i != end);
        {
            System.out.println("end");
        }
    }

}

/**
 * ! Circular Queue 1. internally it's an array but imagine at as a circle. 2.
 * two pointers : START , END. 3. adding and removing is same like LINKEDLIST.
 * 4. Dereferencing is done and when we add new one , we override the old
 * element. 5. 5%5==0 ; 6.
 */
