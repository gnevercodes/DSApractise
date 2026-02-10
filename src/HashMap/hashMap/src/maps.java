
import java.util.HashMap;
import java.util.Map;

public class maps {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.get("Alice");
        scores.getOrDefault("Alices", 44);
        scores.remove("Bob");
        scores.containsKey("Bob");
        scores.containsValue(44);

        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 85);

        if (map.containsKey("Alice")) {
            System.out.println("Alice's score: " + map.get("Alice"));
        }

        // ! ITERATING over a MAP. 
        Map<String, Integer> maps = new HashMap<>();
        maps.put("A", 1);
        maps.put("B", 2);

        // ! Using entrySet
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ! Using keySet
        for (String key : maps.keySet()) {
            System.out.println(key + " -> " + maps.get(key));
        }

        // ! Using values
        for (Integer value : maps.values()) {
            System.out.println(value);
        }
    }
}
/**
 * Notes on maps 1. key value pairs. 2. values can be duplicate. 3. keys maps
 * exactly to one value. 4. HashMap and LinkedHashMap has O(1) get/put average
 * TC. (one null key , multiple null values are allowed). 5. ` linked hashmap
 * has O(logn)`. 6.
 */
