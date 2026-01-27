
public class stringBuilders {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = ((char) ('a' + i));
            builder.append(ch); // n + (n+1) + (n+2) ==== nsquared = tc. 
            /* which is bad time complexity 
             * if there is a datatype we can directly add and make changes in the same object.
             * series = abcd + e = abcde ( no new object )
             * THIS CAN ONLY TAKE N ITERATIONS. 
             * Yes 
             ! this datatype is called as "STRINGBUILDER"   
             */

        }
        builder.append("s");
        int something = builder.charAt(22);
        System.out.println(something);
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
        /* 
        ! this takes N iterations only . 
         */
    }
}
/*	•	Strings → immutable → safe for multi-threading.
	•	StringBuilder → mutable → not thread-safe, fast for single-threaded modifications.
	•	StringBuffer → mutable, thread-safe (slightly slower than StringBuilder). */
