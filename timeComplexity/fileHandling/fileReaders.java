package timeComplexity.fileHandling;

import java.io.*;

public class fileReaders {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a huge ssentence");
        try {
            String is = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(br);

    }
}
