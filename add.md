Key idea:

- Most Data Structures are **built on top of simpler ones**
- Java Collections internally rely heavily on **arrays + linked structures**

---

## 📦 Arrays (Foundation DS)

### Definition

- Fixed-size, contiguous memory structure
- Index-based access

### Internal Implementation

- Stored in contiguous memory blocks
- Fast access, expensive resizing

### Important Operations

| Operation              | Time |
| ---------------------- | ---- |
| Access                 | O(1) |
| Search                 | O(n) |
| Insert/Delete (middle) | O(n) |

### Used Internally By

- ArrayList
- Stack (array-based)
- Queue (array-based)
- Heap

### Key Concepts

- Index math
- Cache friendliness
- Why resizing is expensive

---

## 📦 ArrayList (Dynamic Array)

### Definition

- Resizable array implementation in Java

### Internal Implementation

- Uses a normal array internally
- When full → creates a new array (1.5x size) and copies elements

### Important Methods

- `add(E e)`
- `add(int index, E e)`
- `get(int index)`
- `remove(int index)`
- `size()`

### Time Complexity

- Access → O(1)
- Insert at end → O(1) amortized
- Insert/Delete in middle → O(n)

### Linked To

- Arrays
- Amortized analysis

---

## 🔤 Strings

### Definition

- Sequence of characters

### Internal Implementation (Java)

- Stored as `char[]` / `byte[]`
- Immutable by design

### Related Structures

- `StringBuilder` → mutable, faster
- `StringBuffer` → thread-safe

### Important Methods

- `length()`
- `charAt()`
- `substring()`
- `equals()` vs `==`

### Key Concepts

- Immutability
- Memory optimization
- Why StringBuilder exists

---

## 🔗 Linked List

### Definition

- Collection of nodes linked via pointers

### Types

- Singly Linked List
- Doubly Linked List
- Circular Linked List

### Internal Implementation

- Each node contains data + pointer(s)
- Non-contiguous memory

### Important Methods

- `addFirst()`
- `addLast()`
- `remove()`
- `get(int index)`

### Time Complexity

- Insert/Delete (known node) → O(1)
- Access by index → O(n)

### Used Internally By

- Stack
- Queue
- HashMap buckets (collision handling)

---

## 📚 Stack (LIFO)

### Definition

- Last In, First Out

### Implementations

- Array-based
- LinkedList-based

### Important Methods

- `push()`
- `pop()`
- `peek()`
- `isEmpty()`

### Used For

- Function calls
- Undo/Redo
- Expression evaluation

### Internally Built On

- Arrays or Linked Lists

---

## 🚶 Queue (FIFO)

### Definition

- First In, First Out

### Types

- Queue
- Deque
- PriorityQueue

### Important Methods

- `offer()`
- `poll()`
- `peek()`

### Used For

- Scheduling
- BFS
- Task processing

### Internally Built On

- LinkedList
- Circular arrays

---

## 🔑 HashMap / HashSet

### Definition

- Key-value storage using hashing

### Internal Implementation

- Array of buckets
- Each bucket → LinkedList or Tree (Java 8+)

### Important Methods

- `put()`
- `get()`
- `containsKey()`
- `remove()`

### Key Concepts

- `hashCode()` and `equals()`
- Load factor
- Rehashing
- Collision handling

### Internally Built On

- Arrays
- Linked Lists
- Trees

---

## 🌳 Trees

### Definition

- Hierarchical data structure

### Types

- Binary Tree
- Binary Search Tree (BST)

### Traversals

- Inorder
- Preorder
- Postorder
- Level Order (BFS)

### Key Concepts

- Recursive structure
- Height vs depth

### Used Internally By

- TreeMap
- TreeSet

---

## ⛰ Heap

### Definition

- Complete Binary Tree with heap property

### Types

- Min Heap
- Max Heap

### Internal Implementation

- Array-based representation

### Important Operations

- Insert
- Extract Min/Max
- Heapify

### Used Internally By

- PriorityQueue

---

## 🕸 Graphs

### Definition

- Nodes connected by edges

### Representations

- Adjacency List
- Adjacency Matrix

### Core Algorithms

- BFS
- DFS

### Internally Built On

- Arrays
- Lists
- Queues
- Stacks

---

## 🌲 Trie (Optional / Bonus)

### Definition

- Tree optimized for string operations

### Internal Implementation

- Node with array/map of children

### Used For

- Prefix search
- Autocomplete

---

## 🧠 Final Rule (Most Important)

> Every Data Structure is **not isolated**.  
> It is built from simpler structures you already know.

If you understand this, interviews become conversations — not interrogations.

---

## 🚀 Next Steps

- Implement each DS once in Java
- Add code examples per section
- Move to **NeetCode 150** after fundamentals
- Revise this README before interviews
