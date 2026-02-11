
public class customStack {

    private int[] data; // initialize an array here
    private static final int DEFAULT_SIZE = 10;
    int pointer = -1;

    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int value) {
        this.data = new int[value];
    }

    public boolean push(int value) {

        if (isFull()) {
            System.out.println("the stack is full/cant be pushed");
            return false;
        }
        pointer++;
        data[pointer] = value;
        return true;

    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty");
        }
        int removed = data[pointer];
        pointer--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return data[pointer];
    }

    public boolean isFull() {
        return pointer == data.length - 1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }
}
