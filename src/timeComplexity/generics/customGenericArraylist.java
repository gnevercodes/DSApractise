package timeComplexity.generics;

import java.util.Arrays;

public class customGenericArraylist<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also works as index value. 

    // public customArrayList() {
    //     this.data = new Object[DEFAULT_SIZE];
    // }
    public void add(T num) {
        // add edge case
        if (this.isFull()) {
            resize(); // these two methods are edge cases . 
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = (T) data[i];
        }
        data = temp; // temp is garbage collection . 
    }

    public T remove() {
        @SuppressWarnings("unchecked")
        T removedItem = (T) data[--size];
        return removedItem;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    // public void display() {
    //     System.out.print("[");
    //     for (int i = 0; i < data.length; i++) {
    //         System.out.print("," + data[i]);
    //     }
    //     System.out.println("]");
    // }
    // public void display() {
    //     System.out.print("[");
    //     for (int i : data) {
    //         System.out.print(data[i] + ",");
    //     }
    // }
    public static void main(String[] args) {
        customArrayList list = new customArrayList();

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        System.out.println(list);
        list.display();
    }

    @Override
    public String toString() {
        return "customArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

}
