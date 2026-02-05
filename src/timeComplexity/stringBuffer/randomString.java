package timeComplexity.stringBuffer;

import java.util.Random;

public class randomString {

    public static void main(String[] args) {
        String name = randomString.generate(7);
        System.out.println(name);
    }

    static String generate(int size) {
        // # createe a random string with a length of give value ; 

        // Random random = new Random();
        // String something =  (random.nextFloat());
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int) (random.nextFloat(0, 26));
            sb.append((char) randomChar);

        }
        return sb.toString();

    }
}
