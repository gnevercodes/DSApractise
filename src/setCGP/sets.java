
import java.util.*;

public class sets {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        /**
         * ! No duplicates (ORDER NOT GUARANTEED) ! no indeex based access. #
         * can store null values. # order depends on implementation. Iterable ->
         * Collections -> Set ->(|HashSet| |Treeset| |LinkedHashSet| ).
         */

        /**
         * ! HashSet 1. No dupliates. 2. No guaranteed order. 3. Allows only one
         * null. O(1) for add / remove / search. For checking duplicates : uses
         * HashCode(), equals(). should override it.
         *
         * ! set<Integer> sets = new HashSet<>();
         *
         */
        /**
         * ! LInkedHashSet 1. No dupliates. 2. allows one null. 3. slightly
         * slower than hashset. 4. maintians insertion order.
         *
         */
        /**
         * ! TreeSet 1. No dupliactes. 2. No null values allowed. 3. Sorted
         * Order. 4. O(logN) TreeSet<Integer> set = new TreeSet<>();
         * set.add(30); set.add(10); set.add(20);
         *
         *
         * System.out.println(set);
         */
        // ! important methods.
        // set.add();
        // set.remove(e); 
        // set.contains();
        // set.size();
        // set.clear(); 
        // set.isEmpty(); 
        /**
         * Iterating over a loop. Iterator<Integer> it = set.iterator();
         * while(it.hasNext()) { System.out.println(it.next()); }
         */
    }
}
