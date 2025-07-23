package timeComplexity.fileHandling;

import java.io.*;

public class basics {

    public static void main(String[] args) {
        System.out.println();

        // # reader class.
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("enter some letters");
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
        } catch (IOException e) {
            System.out.println((String) e.getMessage());
        }
        // # file reader methods
        try (FileReader isr = new FileReader("something.txt")) {
            int letters1 = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters1);
                letters1 = isr.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
