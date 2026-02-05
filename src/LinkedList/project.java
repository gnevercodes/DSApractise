
import java.util.LinkedList;
import java.util.Scanner;

public class project {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        String currentText = "";

        while (true) {
            System.out.println("Choose an optin");
            System.out.println("1: Type Text");
            System.out.println("2 : Undo");
            System.out.println("3 : Show Content");
            System.out.println("exit");

            int chooseOption = sc.nextInt();
            sc.nextLine(); // we consume a new line. 

            switch (chooseOption) {
                case 1:
                    System.out.println("enter a text to append");
                    String newText = sc.nextLine();
                    list.add(currentText);
                    currentText += newText;
                    break;

                case 2:
                    if (!list.isEmpty()) {
                        currentText = list.removeLast();
                        System.out.println("undo successful ");
                    } else {
                        System.out.println("nothing is there to undo");
                    }
                    break;

                case 3:
                    System.out.println(" current text : " + currentText);
                    break;

                case 4:
                    System.out.println("exiting editor");
                    return;

                default:
                    System.out.println("invalid");

            }

        }
    }
}
