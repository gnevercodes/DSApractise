
public class customStack {

    /*
     * NOTES : this is a custom stack built using an array.
     * here , we create two constructors for initializing arrays with a default size and arrays if the size is provided.
     * 
     */
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1; // ! creating a pointer to traverse and insert elements.

    public customStack() {
        this(DEFAULT_SIZE); // this calls the below method only , with a custom default size; 
    }

    public customStack(int size) {
        // this constructor should have a empty array initialized everytime the custom stack obj is created. 
        this.data = new int[size];
        // ! thiis is a custom stack with size ; 
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
            return false;

        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot pop an empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

    }

    public int peek() throws Exception {
        // edge case : 
        // !! what if the stack is empty ;
        if (isEmpty()) {
            throw new Exception("the stack is empty");
        }
        return data[ptr];
    }

    public boolean isFull() { // ! this is to check if the ptr has reached the end of the array.
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
