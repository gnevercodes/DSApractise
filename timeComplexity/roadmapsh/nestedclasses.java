package dsapractise.timeComplexity.roadmapsh;

public class nestedclasses {

    public static class Nested {

    }

    public static void main(String[] args) { // * static nested
        nestedclasses.Nested one = new nestedclasses.Nested();
    }
}

// public class Outer{
//     public class Inner{ // * non static nested classes. 
//     }
// }
// Outer outer = new Outer();
// Outer.Inner inner = outer.new Inner();
/*
/*
class Outer {

    public void printText() {  //  *  Local Nested class

        class Local {

        }

        Local local = new Local();
    }

}
 */

 /* Nested classes enable us to logically group classes that are only used in one place, write more readable and maintainable code and increase encapsulation.
* 
* Static nested classes
Non-static nested classes
Local classes 
Anonymous classes 
blog link : https://www.baeldung.com/java-nested-classes
blog link : https://jenkov.com/tutorials/java/nested-classes.html

 */
