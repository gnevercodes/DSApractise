
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
        /**
         * char + char -> Numeric additon String + String -> concat char + int->
         * numeric additon THEN `cast`. String + int -> Concatination String +
         * Oject -> String Concatinatioon. Object + Object = error
         */
    }
}

class PlusOperatorDemo {

    public static void main(String[] args) {

        // 1️⃣ char + char → numeric addition (char treated as int / ASCII)
        System.out.println('a' + 'b');
        // 'a' = 97, 'b' = 98
        // 97 + 98 = 195
        // Output: 195

        // 2️⃣ String + String → concatenation
        System.out.println("a" + "b");
        // Both are Strings → concatenated
        // Output: "ab"

        // 3️⃣ char + int → numeric addition, can cast back to char
        System.out.println((char) ('a' + 3));
        // 'a' = 97, 97 + 3 = 100
        // Cast back to char → 'd'
        // Output: "d"

        // 4️⃣ String + int → concatenation (int converted to String)
        System.out.println("a" + 1);
        // int 1 → "1" automatically
        // Output: "a1"

        // 5️⃣ String + Object → concatenation, calls Object.toString()
        System.out.println("kunal" + new ArrayList<>());
        // new ArrayList<>() → "[]" via toString()
        // Output: "kunal[]"

        // 6️⃣ Object + String → concatenation, calls Object.toString()
        System.out.println(new Integer(0) + " " + new ArrayList<>());
        // Integer(0) → "0", ArrayList → "[]"
        // Output: "0 []"

        // 7️⃣ Object + Object → compile-time error
        // System.out.println(new Integer(0) + new ArrayList<>()); 
        // ❌ Error: + undefined between two objects
        // Must have at least one String to concatenate
    }
}
