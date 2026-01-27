
public class basic {

    public static void main(String[] args) {
        String name = new String("ganesh");
        String prefname = new String("ganesh");
        // Integer num = new Integer(50); 
        // points to the same . 
        // String is a class; 
        // capital letter is a class.
        //          
        /* 
         * String name= "ganesh"
         * stored as a string pool 
         * string pool is a seperate memory structure in HEAP
         * SO  ALL THE SIMILAR VALUES ARE NOT BEING CREATED AGAIN 
         * Comparision of Strings
         *  == is a comparitor.
         * this checks if the reference variable points to same obj.
         * 
         */
 /* 
            ! how to create two objects of same value .
            ! String name= new String("kunal")
            !String nameB= new String("kunal") 
            * Outside of String Pool these lie. 
            * these gives us false when checked with == 
            ? we should use .equals method to check for two diff str
            * wrapper class has so many methods to be used. 
         */
        System.out.println(name.equals(prefname));
        System.out.println(name.charAt(0));
    }
}
/*
*  String Literal vs new String()
* Case 1: String Literal
* ✔ Stored in String Constant Pool (SCP)
✔ Java reuses existing strings
✔ Memory efficient
✔ Faster
✔ Most common in real projects

!  Case 2: Using new
* ✔ Always creates a NEW object in Heap memory
✔ Even if "ganesh" already exists
✔ Less memory efficient
✔ Rarely needed in real code
 */
