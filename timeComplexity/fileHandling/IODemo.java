
import java.io.*;

public class IODemo {

    public static void main(String[] args) {
        String filePath = "something.txt";

        try {
            // 1. Get input from user and save to file
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a line to save to file: ");
            String userInput = consoleInput.readLine();

            // Save it using FileWriter (character stream)
            FileWriter fw = new FileWriter(filePath);
            fw.write(userInput);
            fw.close();
            System.out.println("Saved to " + filePath);

            // 2. Read back using FileInputStream (byte stream)
            System.out.println("\n🔹 Reading with FileInputStream (byte-by-byte):");
            FileInputStream fis = new FileInputStream(filePath);
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // casting byte to char
            }
            fis.close();

            // 3. Read back using FileReader (character stream)
            System.out.println("\n\n🔸 Reading with FileReader (char-by-char):");
            FileReader fr = new FileReader(filePath);
            int charData;
            while ((charData = fr.read()) != -1) {
                System.out.print((char) charData);
            }
            fr.close();

            // 4. Read back using BufferedReader (line-by-line)
            System.out.println("\n\n⚡ Reading with BufferedReader (line-by-line):");
            BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
