
import java.util.LinkedList;

public class linkedListBroCode {
    // non contiguous
    // bad at searching 
    // begin at the end. 
    // linear time for searching

    // Types : Singly , Doubly . 
    // Traversing is easy in doubly .
    // non consecutive mem locations these nodes are stored.
    // linked using poinders.
    // adv : 
    // dynamic DS , insertion and deletion is o(1) , no low level mem waste. 
    // disadv : greater mem usage  , no random access , accessing / searching is time consuming. 
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.push("S");
        list.push("t");
        list.push("w");  // stack 
        list.push("v");

        list.offer("z");
        list.poll();
        System.out.println(list);
        System.out.println(list.indexOf("s"));
        list.addFirst("2");

    }

    public void something() {

    }
}
