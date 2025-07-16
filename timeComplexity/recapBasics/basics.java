package timeComplexity.recapBasics;

public class basics {

    String name;

    public static void main(String[] args) {
        // stacks and heaps 
        basics one = new basics("ganesh");

    }
    // constructor overloading . 
    // we need to have a empty one if we create a custom constructor. 

    basics(String name) {
        this.name = name; // this naming convention is used when referring , assigning. 
        System.out.println(name);
    }
}
