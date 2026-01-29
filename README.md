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
      └── Queue
           ├── PriorityQueue
           └── Deque

Map
 ├── HashMap [X]
 ├── TreeMap
 └── LinkedHashMap

```

## TODO:

1. Arrays [X]
2. Strings [X]
3. ArrayList [X] - custom implementation , generic todo
4. HashMap / HashSet [ ]
5. Stack & Queue [ ]
6. Linked List [X] - single LL[X],doubly[ ],circular[ ] .
7. Trees (BST, Heap) [ ]
8. Graphs (basic BFS/DFS) [ ]
