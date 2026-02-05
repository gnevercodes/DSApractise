
public class performance {

    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {
            char ch = ((char) ('a' + i));
            series += ch; // n + (n+1) + (n+2) ==== nsquared = tc. 
            /* which is bad time complexity 
             * if there is a datatype we can directly add and make changes in the same object.
             * series = abcd + e = abcde ( no new object )
             * THIS CAN ONLY TAKE N ITERATIONS. 
             * Yes 
             ! this datatype is called as "STRINGBUILDER"   
             */

        }
        System.out.println(series); // all characters will be added. 

    }
}
