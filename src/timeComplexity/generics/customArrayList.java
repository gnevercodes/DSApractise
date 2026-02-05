package timeComplexity.generics;

import java.util.Arrays;

public class customArrayList {

    private int[] data; // this is an array here. 
    private final static int DEFAULT_SIZE = 10; // static default size. 
    private int size = 0; // also works as index value. 

    public customArrayList() {
        this.data = new int[DEFAULT_SIZE];

    }

    public void add(int num) {
        // add edge case
        if (this.isFull()) {
            resize(); // these two methods are edge cases . 
        }
        data[size++] = num; // * post increment 
        /*
        data[size]= num; 
        size+=1; 
         */
    }

    private boolean isFull() {
        return size == data.length; // returns a boolean if full:TRUE,not full:FALSE
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp; // temp is garbage collection . 
    }

    public int remove() {
        int removedItem = data[--size];
        // size=size-1; 
        // int removeditem= data[size]; 
        return removedItem;
    }

    public int get(int index) {
        return data[index];
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
    public void display() {
        System.out.print("[");
        for (int i : data) {
            System.out.print(data[i] + ",");
        }
        System.out.println("]");
    }

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
