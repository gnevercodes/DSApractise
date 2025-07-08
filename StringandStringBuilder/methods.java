
import java.util.Arrays;

public class methods {
// ! methods in the string. 

    public static void main(String[] args) {

        String name = "ganesh hello he says ";
        System.out.println(Arrays.toString(name.toCharArray()));
        // ! methods create new object and applies those methods.
        System.out.println(name.indexOf('a'));
        System.out.println("     ganesh  ".strip()); // ? white space is removed. 
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
/*
 * 
 * ! to learn 
 ! to check if a string is palindrome or not. 
 ? solution : reverse it and check 
 ? create a stringBuilder and add from last 
 ? take Start and End pointer if start = end , move start , end by 1 ; use for loop 

 */
