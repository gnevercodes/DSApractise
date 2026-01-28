package timeComplexity.generics;

import java.util.Arrays
import timeComplexity.ObjectCloning.temp;

public class practise {

    private int[] data;
    private static int DEFAULT_SIZEis = 10;
    private int size = 0;

    public void arrayListTemp() {
        this.data = new int[DEFAULT_SIZEis];
    }

    public void add(int number) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = number;

    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temporaryArray = new int[data.length * 2];
        for (int i = 0; i < temporaryArray.length; i++) {
            temporaryArray[i] = data[i];
        }
        data = temporaryArray;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int getSize() {
        return size;
    }

    public void set(int index, int number) {
        data[index] = number;
    }

    public void display() {
        System.out.println("[");
        for (int i : data) {
            System.out.println(data[i] + ",");
        }
        System.out.println("]");
    }

    @Override
    public String toString() {
        return "custom ArrayList [data=" + Arrays.toString(data) + ", size =" + size + "]";
    }

}
