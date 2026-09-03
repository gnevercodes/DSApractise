# DSApractise

a github where i sharpen my dsa skills .

## important points

# Java Execution Order — 10 Key Points

1. **JVM Startup:** JVM starts, searches for `main()`, and loads the class containing `main()`.

2. **Class Loading (Static Phase):** Static variables and static blocks execute **once per class** at class load, top → bottom. Static methods become available but do **not** run automatically.

3. **main() Execution:** After class loading, `main()` starts. Local variables here live on the **stack**.

4. **Object Creation (`new` Keyword`):** Each object creation allocates memory on the **heap**.

5. **Instance Variable Initialization:** Instance variables are initialized top → bottom **before constructor runs**.

6. **Instance Initializer Blocks:** Executed **after instance variables**, but **before the constructor**.

7. **Constructor Execution:** Runs last during object creation, after instance vars and instance blocks are ready.

8. **Method Execution:**
   - Instance methods run when called on objects
   - Static methods run when called via class or object reference
   - Local variables live on the **stack**

9. **Garbage Collection (GC):** Objects with no references become eligible; GC runs automatically at JVM’s discretion.

10. **Inheritance Execution Order:**  
    Parent static vars → Child static vars → Parent instance vars → Parent constructor → Child instance vars → Child constructor in order

```
      |-Array[X]
Iterable
 └── Collection
      ├── List
      │    ├── ArrayList[X]
      │    └── LinkedList[X]
      ├── Set
      │    ├── HashSet[X]
      │    └── TreeSet
      └── Queue[X]
           ├── PriorityQueue
           └── Deque

Map
 ├── HashMap [X]
 ├── TreeMap
 └── LinkedHashMap

```

## TODO:

1. Arrays []
2. Strings []
3. ArrayList [] - custom implementation , generic todo
4. HashMap / HashSet []
5. Stack & Queue [] - // TODO: Circular.
6. Linked List [] - single LL[],doubly[ ],circular[ ] .
7. Trees (BST, Heap) [ ]
8. Graphs (basic BFS/DFS) [ ]

Java DSA – LeetCode Cheat Sheet 🧠💻

A clean README.md you can directly push to GitHub.
Focused only on what you actually use in LeetCode & interviews.

⸻

📌 How to use this
• Read once → understand
• Keep it open while solving problems
• Don’t memorize, build muscle memory

⸻

📦 Arrays

int[] arr = new int[n];
int[] arr2 = {1, 2, 3};

Common operations

arr[i]; // access
arr.length; // size
Arrays.sort(arr);

Used in: Two Pointers, Sliding Window, Prefix Sum

⸻

🧵 Strings

String s = "hello";

s.length();
s.charAt(i);
s.substring(l, r);
s.equals(other);
s.indexOf('a');

StringBuilder (VERY IMPORTANT)

StringBuilder sb = new StringBuilder();
sb.append("abc");
sb.deleteCharAt(i);
sb.reverse();
sb.toString();

⸻

📚 ArrayList

List<Integer> list = new ArrayList<>();

list.add(x);
list.get(i);
list.set(i, val);
list.remove(i);
list.size();
list.contains(x);

⸻

🔗 LinkedList

LinkedList<Integer> ll = new LinkedList<>();

ll.addFirst(x);
ll.addLast(x);
ll.removeFirst();
ll.removeLast();

⚠️ LeetCode mostly uses custom Node-based linked lists, not this class.

⸻

📥 Stack (LIFO)

Stack<Integer> st = new Stack<>();

st.push(x);
st.pop();
st.peek();
st.isEmpty();

Used in: Valid Parentheses, Monotonic Stack

⸻

📤 Queue (FIFO)

Queue<Integer> q = new LinkedList<>();

q.offer(x);
q.poll();
q.peek();
q.isEmpty();

Used in: BFS, Level Order Traversal

⸻

🚀 Deque (Double Ended Queue)

Deque<Integer> dq = new ArrayDeque<>();

dq.addFirst(x);
dq.addLast(x);
dq.pollFirst();
dq.pollLast();
dq.peekFirst();
dq.peekLast();

Used in: Sliding Window Maximum

⸻

🧺 HashSet

Set<Integer> set = new HashSet<>();

set.add(x);
set.contains(x);
set.remove(x);
set.size();

Used in: Duplicate detection, Cycle detection

⸻

🗺️ HashMap (TOP 3 MOST USED)

Map<Integer, Integer> map = new HashMap<>();

map.put(k, v);
map.get(k);
map.getOrDefault(k, 0);
map.containsKey(k);
map.remove(k);
map.size();

Iterating map (VERY IMPORTANT)

for (Map.Entry<Integer, Integer> e : map.entrySet()) {
e.getKey();
e.getValue();
}

Used in: Frequency count, Prefix sum, Sliding window

⸻

🌲 TreeMap / TreeSet

TreeMap<Integer, Integer> tm = new TreeMap<>();
TreeSet<Integer> ts = new TreeSet<>();

tm.firstKey();
tm.lastKey();
tm.ceilingKey(x);
tm.floorKey(x);

Used when sorted order is required

⸻

⛰️ PriorityQueue (Heap)

PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

pq.offer(x);
pq.poll();
pq.peek();
pq.size();

Used in: Top K problems, Heap, Scheduling

⸻

🛠️ Useful Utilities

Arrays.sort(arr);
Collections.sort(list);
Collections.reverse(list);
Collections.max(list);

⸻

✅ What to learn NEXT
• DSA Patterns (Two Pointers, Sliding Window, BFS/DFS)
• Recursion
• Time & Space Complexity
• Start LeetCode (Easy → Medium)

⸻

⭐ If you master this file, you are 70% LeetCode ready.

Happy grinding 🚀
