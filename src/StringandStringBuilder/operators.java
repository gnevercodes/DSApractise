
import java.util.ArrayList;

public class operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b'); // character value ascii value. char + char
        System.out.println("a" + "b"); // concatenate.  string+string
        System.out.println((char) ('a' + 3)); // char + int
        System.out.println("a" + 1); // string + int.concat
        /*
         * System.out.println("a" + 1); // string + int.concat
         * so this is as same as a+1 ; 
         * integer will be converted into Wrapper class Integer
         * and this calls .toString() method. 
         */

        System.out.println("kunal" + new ArrayList<>());
        /*
         *  kuanl + new arraylist here it is empty so it returns [] and it is concatenated
         * with the kunal so o/p is "kunal[]"
         */
        System.out.println(new Integer(0) + " " + new ArrayList<>());
        /*
        
        * System.out.println(new Integer() + new ArrayList<>()); 
        * this gives us error because this + is only applicable for "primitives"+String. 
        * 
         */

 /*
         ! THE ONLY REASON WHY JAVA SUPPORTS + operator overloading IS TO SUPPORT CONCATENATION. ( INTENTIONALLY SUPPORTED TO HAVE STRING CONCATENATION / STRING JOINING) 
         */
    }
}
