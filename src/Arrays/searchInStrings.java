
import java.util.Arrays;

public class searchInStrings {

    public static void main(String[] args) {
        String name = "ganesh ";

        char target = 's';
        boolean charFound = searchInStrings.searchinStr(name, target);
        System.out.println("character found or not" + charFound);
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    public static boolean searchinStr(String str, char target) {
        // everytime , we write the conditions like if the given one is empty or not .
        // like a check condition , 

        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) { // going at every character using the charAt() function for strings .
                return true;
            }
        }

        // for (char ch : str.toCharArray()) { // this func makes the str into a char array .
        //     if (ch == target) {
        //         return true;
        //    
        //     }
        // } return false // only one false statement after entire traversal of the loop . 
        return false;

    }
}
