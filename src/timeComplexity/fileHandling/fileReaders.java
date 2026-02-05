package timeComplexity.fileHandling;

import java.io.*;
import java.util.Scanner;

public class fileReaders {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a huge ssentence");
        try {
            String is = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(br);

        // scanner input methods
        int x = sc.nextInt();          // integer
        long l = sc.nextLong();       // long
        float f = sc.nextFloat();     // float
        double d = sc.nextDouble();   // double
        boolean b = sc.nextBoolean();// true / false
        String s = sc.next();         // single word
        String line = sc.nextLine();  // full line
    }
}
