package timeComplexity.recapBasics;

//package timeComplexity.recapBasics;
// primitives are stored in stack . 
// 
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
    // final prevents content from being modified. (only for primitive) we can do it but we cannot reassign it. 
    // but it should be initialized when we are declaring a variable . 

    // ! packages : helps us keep compartmentalize. 
}
