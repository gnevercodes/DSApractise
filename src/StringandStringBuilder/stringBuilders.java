
public class stringBuilders {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = ((char) ('a' + i));
            builder.append(ch); // n + (n+1) + (n+2) ==== nsquared = tc. 
            /* which is bad time complexity 
             * if there is a datatype we can directly add and make changes in the same object.
             * series = abcd + e = abcde ( no new object )
             * THIS CAN ONLY TAKE N ITERATIONS. 
             * Yes 
             ! this datatype is called as "STRINGBUILDER"   
             */

        }
        builder.append("s");
        int something = builder.charAt(22);
        System.out.println(something);
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
        /* 
        ! this takes N iterations only . 
         */
    }
}
/*	•	Strings → immutable → safe for multi-threading.
	•	StringBuilder → mutable → not thread-safe, fast for single-threaded modifications.
	•	StringBuffer → mutable, thread-safe (slightly slower than StringBuilder). */

 /*
==================== System.out.println() + toString() Cheat Sheet ====================

Rule:
- System.out.println(obj) internally calls obj.toString() if obj != null.
- For primitives, println prints the value directly.
- For objects, it depends on whether toString() is overridden.

---------------------------------------------------------------------------------------
1️⃣ Primitives
---------------------------------------------------------------------------------------
int x = 42;
System.out.println(x);     // Output: 42

double y = 3.14;
System.out.println(y);     // Output: 3.14

char c = 'a';
System.out.println(c);     // Output: a

boolean b = true;
System.out.println(b);     // Output: true

---------------------------------------------------------------------------------------
2️⃣ Strings
---------------------------------------------------------------------------------------
String s = "Ganesh";
System.out.println(s);          // Output: Ganesh
System.out.println(s.toString()); // Output: Ganesh
// Both are same, since s.toString() returns the string itself

---------------------------------------------------------------------------------------
3️⃣ StringBuilder / StringBuffer
---------------------------------------------------------------------------------------
StringBuilder sb = new StringBuilder("Ganesh");
System.out.println(sb);          // Output: Ganesh
System.out.println(sb.toString()); // Output: Ganesh
// println automatically calls toString()

---------------------------------------------------------------------------------------
4️⃣ ArrayList / HashMap / other Collections
---------------------------------------------------------------------------------------
ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
System.out.println(list);       // Output: [1, 2]
System.out.println(list.toString()); // Output: [1, 2]
// Collections override toString() for readable format

HashMap<String,Integer> map = new HashMap<>();
map.put("a", 1);
System.out.println(map);        // Output: {a=1}
// Again, toString() is called internally

---------------------------------------------------------------------------------------
5️⃣ Custom Classes
---------------------------------------------------------------------------------------
class Person {
    String name;
    Person(String n) { name = n; }
}

Person p = new Person("Ganesh");
System.out.println(p);          // Output: Person@6f496d9f
// Default Object.toString(): ClassName@hashCode

// If overridden
@Override
public String toString() {
    return name;
}

System.out.println(p);          // Output: Ganesh

---------------------------------------------------------------------------------------
✅ Key Takeaways for Interviews:
1. println(obj) → calls obj.toString() internally.
2. If obj is primitive → printed directly.
3. If obj is String → toString() returns the same String.
4. If obj is Collection → prints in readable format (toString() overridden)
5. If obj is custom class → override toString() for meaningful output.
6. Null objects → prints "null"

 */
