
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ganesh", 25);
        map.put("Alice", 22);
        map.put("Ganesh", 26); // overwrites the above one. 
        map.get("Ganesh");
        map.containsKey("Alice");
        map.remove("Ganesh");
        // ! HashMap uses an array of buckets, and each bucket stores entries as a LinkedList or Tree based on hash collisions.
        /*
        ! Important points
        * average time : O(1) for get/put. 
        * worst case : O(n)-> o(logn) ; 
        * allows one null key. 
        * not ordered. 
         */

        // !  HashTable. 
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // ignored  
        // ! Notes
        /*
        * hashset is backed up by hashmap. 
        *  set : Unique values . 
        *  insert , search , delete takes O(1) time. 
        * 
         */

    }
}
