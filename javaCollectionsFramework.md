# 📚 Java Collections Framework (JCF) – Complete Hierarchy

> Focus: Structure + Internal Implementation + Interview Points

---

# 🧠 1️⃣ Root Interface

Iterable
└── Collection (except Map)

Map is separate from Collection hierarchy.

---

# 📦 2️⃣ Collection Interface

Collection
├── List
├── Set
└── Queue

---

# 🔹 LIST (Ordered, Allows Duplicates)

List
├── ArrayList
├── LinkedList
├── Vector (Legacy)
└── Stack (extends Vector)

## 📌 Implementations

### ArrayList

- Internal: Resizable array
- Fast random access
- Slow middle insert/delete

### LinkedList

- Internal: Doubly linked list
- Fast insert/delete at ends
- Slow random access

### Vector

- Same as ArrayList but synchronized
- Legacy

### Stack

- LIFO
- Extends Vector
- Legacy (Use ArrayDeque instead)

---

# 🔹 SET (No Duplicates)

Set
├── HashSet
├── LinkedHashSet
└── TreeSet

## 📌 Implementations

### HashSet

- Internal: HashMap
- Unordered
- O(1) average

### LinkedHashSet

- Internal: HashMap + Linked List
- Maintains insertion order

### TreeSet

- Internal: Red-Black Tree
- Sorted order
- O(log n)

---

# 🔹 QUEUE

Queue
├── LinkedList
├── PriorityQueue
└── Deque

## 📌 Implementations

### PriorityQueue

- Internal: Binary Heap
- Removes smallest (min-heap default)
- O(log n)

### Deque

├── ArrayDeque
└── LinkedList

ArrayDeque:

- Internal: Resizable circular array
- Fastest stack/queue replacement

---

# 🗺 MAP (Separate Hierarchy)

Map
├── HashMap
├── LinkedHashMap
├── TreeMap
└── Hashtable (Legacy)

---

## 📌 Implementations

### HashMap

- Internal: Array + LinkedList + Tree (Java 8+)
- O(1) average

### LinkedHashMap

- HashMap + Doubly Linked List
- Maintains insertion order

### TreeMap

- Red-Black Tree
- Sorted keys
- O(log n)

### Hashtable

- Synchronized HashMap
- Legacy

---

# 🏆 Interview Gold Statements

- HashMap → Array + LinkedList + Tree
- TreeMap → Red-Black Tree
- HashSet → Backed by HashMap
- PriorityQueue → Binary Heap
- ArrayList → Dynamic array
- LinkedList → Doubly linked list

---

# 🚀 Modern Best Practices

Instead of:

- Stack → Use ArrayDeque
- Hashtable → Use ConcurrentHashMap
- Vector → Use ArrayList
