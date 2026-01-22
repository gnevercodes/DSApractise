// package dsapractise.timeComplexity.math;

public class math {

    public static void main(String[] args) {

    }

    public void someOperations() {
        int abs1 = Math.abs(-10);
        // Math.abs(int)
        // Math.abs(long) can be overloaded in 4 versionss. 
        // Math.abs(float)
        // Math.abs(double)
        // Math.ceil() // rounds to upper value; 
        // ! Math.min and Math.max(); 
        // ! Math.round() :  method rounds a float or double to the nearest integer using normal math round rules
        double floor = Math.floor(7.343);  // floor = 7.0
        double result3 = Math.floorDiv(-100, 9); //Math.floorDiv() method divides one integer (int or long) by another, and rounds the result down to the nearest integer value
        double random = Math.random() * 100D; // random values ;
        double exp1 = Math.exp(1); // ! exponential value ;
        double log1 = Math.log(1); // ? logarithmic value; 
        double log10_1 = Math.log10(1); // * logarithmic value but to the base 10; 
        double pow2 = Math.pow(2, 2); // * power value ; 
        double sqrt = Math.sqrt(4);

        /*
        ! Trignometric Math functions
        * Math.PI; 
        * Math.sin() ; 
        * Math.cos() ; 
        * Math.tan(); 
        * Math.asin() ;
        * Math.acos(); 
        * Math.atan(); 
        * Math.cosh() ; 
         */
    }
}
/*
* Java's Math class static methods do not always return double. It depends on the method and its overloads:
Mathematical functions like Math.sqrt(), Math.pow(), Math.sin(), Math.exp(), Math.log(), etc., typically return double for precision.
Other methods have varying return types:
Math.abs() returns the same type as its input (e.g., int for int, double for double).
Math.max() and Math.min() return the same type as their inputs.
Math.round() returns long for double input or int for float.
Math.floorDiv() returns int or long depending on input types.
In your code, methods like Math.floor(), Math.random(), Math.exp(), etc., return double, but that's specific to those functions. Always check the method signature for the exact return type.
 */
