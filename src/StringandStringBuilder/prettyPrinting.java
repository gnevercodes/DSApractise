
public class prettyPrinting {

    public static void main(String[] args) {
        float a = 534.44444f;
        System.out.printf("formatted number is %.2f", a);
        System.out.printf("the value of PI is %.3f", Math.PI);
        System.out.println();
        System.out.printf("hello my name is %s and I am %s ", "Gnaehs", "newbie ");

        /*
         *  place holders
         * %c, %d, %e %f , %n , 
         */
 /*	%s → String
	•	%d → Integer
	•	%f → Floating point
	•	.2f → 2 decimal places
	•	%n → newline (platform independent) */
    }
}
/*
Pretty Printing in Java
	1.	What is Pretty Printing?
Pretty printing means printing data in a well-formatted, human-readable way instead of messy output.
Example:
int a = 5, b = 10;
System.out.println(“a: “ + a + “, b: “ + b);
Output: a: 5, b: 10
	2.	Using System.out.printf()
String name = “Ganesh”;
int age = 25;
double score = 98.5;
System.out.printf(“Name: %s, Age: %d, Score: %.2f\n”, name, age, score);
Placeholders: %s=String, %d=Integer, %f=Floating point, .2f=2 decimals, %n=newline
	3.	Column-Aligned Tables
System.out.printf(”%-10s %-5s %-6s\n”, “Name”, “Age”, “Score”);
System.out.printf(”%-10s %-5d %-6.2f\n”, “Ganesh”, 25, 98.5);
%-10s = left-align 10 chars string, %-5d = left-align int in 5 chars, %-6.2f = left-align float 6 chars, 2 decimals
	4.	Using String.format()
String formatted = String.format(”%-10s %-5d %-6.2f”, “Bob”, 22, 91.0);
System.out.println(formatted);
Output: Bob        22    91.00
	5.	Pretty Printing Arrays / 2D Arrays
int[] arr = {1,2,3,4};
System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4]
int[][] arr2D = {{1,2},{3,4}};
System.out.println(Arrays.deepToString(arr2D)); // [[1, 2], [3, 4]]
	6.	Pretty Printing JSON (Optional)
Gson gson = new GsonBuilder().setPrettyPrinting().create();
System.out.println(gson.toJson(myObject));
Output:
{
“name”: “Ganesh”,
“age”: 25,
“score”: 98.5
}
	7.	Interview Notes

	•	printf and String.format are used for alignment and decimals.
	•	Arrays.toString() for arrays, Arrays.deepToString() for 2D arrays.
	•	toCharArray() for string character manipulation.
	•	Helps debugging, readability, and professional style.
	•	One-liner: Pretty printing formats output neatly for readability and debugging.
 */
