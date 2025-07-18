package timeComplexity.class4;

abstract public class abstractInterfaces {

    // abstract methods gives us a template. 
    // child class must override this thing.
    // ! must override it. 
    // class must be declared "abstract" if it has a method has "abstract" methods. 
    // USE Case : if those methods defly needs to be implemented. 
    abstract void career(String name);

    abstract void partner(String name, int age);

    // ! static normal method which is same everywhere. 
    static void something() {
        System.out.println("blah");
    }

    // ! normal methods
    void normal() {
        System.out.println("this is a normal");
    }

}
