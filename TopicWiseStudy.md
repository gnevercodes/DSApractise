# 📌 Data Structures & Algorithms (DSA) Mastery Checklist

> Goal: Build strong DSA fundamentals first, then complete NeetCode 150 confidently  
> Timeline: ~2–3 months (Entry-level ready)  
> Language Focus: Java

---

## 🧠 Core DSA Foundations

### ⏱ Time & Space Complexity

- [ ] Big-O notation (O(1), O(n), O(log n), O(n log n), O(n²))
- [ ] Best / Average / Worst case
- [ ] Time vs Space trade-offs
- [ ] Amortized complexity

---

## 🔹 Linear Data Structures

### 📦 Arrays

**Concepts to focus on:**

- Index-based access
- Static vs dynamic arrays
- Memory layout (contiguous)
- Edge cases (empty, single element)

**Patterns to learn:**

- [ ] Sliding Window
- [ ] Two Pointers
- [ ] Prefix Sum
- [ ] Kadane’s Algorithm (intro)

---

### 🔤 Strings

**Concepts to focus on:**

- Immutability (Java strings)
- StringBuilder vs StringBuffer
- ASCII vs Unicode
- Character frequency

**Patterns to learn:**

- [ ] Two pointers
- [ ] Hashing for frequency
- [ ] Palindrome checks
- [ ] Substring problems

---

### 🔗 Linked Lists

**Types:**

- [ ] Singly Linked List
- [ ] Doubly Linked List
- [ ] Circular Linked List

**Concepts to focus on:**

- Node manipulation
- Pointer movement
- Memory vs array comparison

**Patterns to learn:**

- [ ] Reverse a linked list
- [ ] Fast & slow pointers
- [ ] Cycle detection
- [ ] Merge two lists

---

### 📚 Stack

**Concepts to focus on:**

- LIFO behavior
- Stack using array / linked list
- Call stack (recursion)

**Patterns to learn:**

- [ ] Valid parentheses
- [ ] Next Greater Element
- [ ] Monotonic stack
- [ ] Infix → Postfix

---

### 🚶 Queue

**Types:**

- [ ] Simple Queue
- [ ] Circular Queue
- [ ] Deque
- [ ] Priority Queue

**Concepts to focus on:**

- FIFO behavior
- Circular indexing
- Queue vs Stack use cases

**Patterns to learn:**

- [ ] BFS foundation
- [ ] Sliding window maximum
- [ ] Producer–consumer model

---

## 🔹 Non-Linear Data Structures

### 🔑 Hashing (VERY IMPORTANT)

**Structures:**

- [ ] HashMap
- [ ] HashSet

**Concepts to focus on:**

- hashCode() vs equals()
- Collision handling
- Load factor & resizing
- Internal working of HashMap

**Patterns to learn:**

- [ ] Frequency counting
- [ ] Two-sum style problems
- [ ] Duplicate detection

---

### 🌳 Trees

**Types:**

- [ ] Binary Tree
- [ ] Binary Search Tree (BST)
- [ ] Balanced Trees (concept only)

**Concepts to focus on:**

- Tree height & depth
- Recursive thinking
- Node relationships

**Traversals:**

- [ ] Inorder
- [ ] Preorder
- [ ] Postorder
- [ ] Level Order (BFS)

---

### ⛰ Heap

**Types:**

- [ ] Min Heap
- [ ] Max Heap

**Concepts to focus on:**

- Complete binary tree
- Heap property
- Array-based representation

**Patterns to learn:**

- [ ] Heapify
- [ ] Top K elements
- [ ] Priority Queue usage

---

### 🕸 Graphs

**Representations:**

- [ ] Adjacency List
- [ ] Adjacency Matrix

**Traversals:**

- [ ] BFS
- [ ] DFS

**Concepts to focus on:**

- Visited tracking
- Connected components
- Cycle detection (basic)
- Shortest path (intro)

---

### 🌲 Trie (Optional / Bonus)

**Concepts to focus on:**

- Prefix trees
- Character indexing
- Memory trade-offs

**Operations:**

- [ ] Insert
- [ ] Search
- [ ] StartsWith

---

## 🔹 Algorithms

### 🔍 Searching

- [ ] Linear Search
- [ ] Binary Search
- [ ] Binary Search on answer space

---

### 🔃 Sorting

**Learn well:**

- [ ] Bubble Sort (concept)
- [ ] Selection Sort
- [ ] Insertion Sort
- [ ] Merge Sort
- [ ] Quick Sort

**Concepts to focus on:**

- Stability
- In-place vs extra space
- Time complexity

---

### 🔁 Recursion (CRITICAL)

**Concepts to focus on:**

- Base case
- Stack memory
- Recursive tree

**Practice:**

- [ ] Fibonacci
- [ ] Reverse array / string
- [ ] Subsets & permutations (intro)

---

### 🧩 Backtracking

**Concepts to focus on:**

- Decision tree
- Undoing choices

**Problems:**

- [ ] Subsets
- [ ] Combinations
- [ ] N-Queens (concept)

---

### 🪙 Greedy Algorithms

**Concepts to focus on:**

- Local vs global optimum
- Sorting before greedy choice

**Problems:**

- [ ] Activity selection
- [ ] Interval scheduling

---

### 🧠 Dynamic Programming (INTRO ONLY)

**Concepts to focus on:**

- Overlapping subproblems
- Memoization vs Tabulation

**Problems:**

- [ ] Fibonacci DP
- [ ] 0/1 Knapsack (concept)
- [ ] Subarray DP

---

## 🎯 Final Prep Before NeetCode 150

- [ ] Implement each DS once
- [ ] Know time & space trade-offs
- [ ] Explain approach verbally
- [ ] Identify problem patterns quickly
- [ ] Clean, readable Java code

---

## 🚀 Next Step

➡️ Start **NeetCode 150** after completing this checklist  
➡️ Focus on **patterns**, not problem count

## Important TC's :

# 📌 Data Structures – Important Time & Space Complexities (Java)

> Purpose: Quick interview revision + strong intuition  
> Focus: Most-used operations & their complexities  
> Language: Java (but concepts are language-agnostic)

---

## 📦 Arrays

### Operations

| Operation              | Time Complexity |
| ---------------------- | --------------- |
| Access by index        | O(1)            |
| Search                 | O(n)            |
| Insert (end)           | O(1) amortized  |
| Insert/Delete (middle) | O(n)            |

### Space

- O(n)

### Interview Notes

- Contiguous memory
- Shifting elements makes insert/delete expensive
- Used heavily in sliding window & two-pointer problems

---

## 🔤 Strings (Java)

### Operations

| Operation            | Time Complexity |
| -------------------- | --------------- |
| Access charAt        | O(1)            |
| Concatenation (`+`)  | O(n)            |
| StringBuilder append | O(1) amortized  |

### Space

- O(n)

### Interview Notes

- Strings are **immutable**
- Prefer `StringBuilder` in loops

---

## 🔗 Linked List

### Operations

| Operation                  | Time Complexity |
| -------------------------- | --------------- |
| Insert/Delete (given node) | O(1)            |
| Search                     | O(n)            |
| Access by position         | O(n)            |

### Space

- O(n)

### Interview Notes

- No random access
- Used in fast/slow pointer problems

---

## 📚 Stack

### Operations

| Operation | Time Complexity |
| --------- | --------------- |
| Push      | O(1)            |
| Pop       | O(1)            |
| Peek      | O(1)            |

### Space

- O(n)

### Interview Notes

- LIFO
- Used in recursion, parsing, monotonic stack problems

---

## 🚶 Queue

### Operations

| Operation | Time Complexity |
| --------- | --------------- |
| Enqueue   | O(1)            |
| Dequeue   | O(1)            |
| Peek      | O(1)            |

### Space

- O(n)

### Interview Notes

- FIFO
- BFS, sliding window, producer–consumer

---

## 🔑 HashMap / HashSet

### Operations

| Operation          | Average | Worst |
| ------------------ | ------- | ----- |
| Get / Put / Remove | O(1)    | O(n)  |

### Space

- O(n)

### Interview Notes

- Depends on `hashCode()` & `equals()`
- Collision handling via buckets
- MOST IMPORTANT DS in interviews

---

## 🌳 Trees (Binary Tree / BST)

### Traversals

| Traversal                      | Time |
| ------------------------------ | ---- |
| Inorder / Preorder / Postorder | O(n) |

### Operations (BST)

| Operation       | Average  | Worst |
| --------------- | -------- | ----- |
| Search / Insert | O(log n) | O(n)  |

### Space

- O(n)

### Interview Notes

- Height matters
- Recursion = stack space

---

## ⛰ Heap (Priority Queue)

### Operations

| Operation | Time     |
| --------- | -------- |
| Insert    | O(log n) |
| Remove    | O(log n) |
| Peek      | O(1)     |

### Space

- O(n)

### Interview Notes

- Complete binary tree
- Used in Top-K & scheduling problems

---

## 🕸 Graphs

### Traversals

| Algorithm | Time     |
| --------- | -------- |
| BFS       | O(V + E) |
| DFS       | O(V + E) |

### Space

- O(V + E)

### Interview Notes

- Use visited set/array
- Adjacency list preferred

---

## 🔍 Searching Algorithms

| Algorithm     | Time     |
| ------------- | -------- |
| Linear Search | O(n)     |
| Binary Search | O(log n) |

---

## 🔃 Sorting Algorithms

| Algorithm      | Best       | Average    | Worst      |
| -------------- | ---------- | ---------- | ---------- |
| Bubble Sort    | O(n)       | O(n²)      | O(n²)      |
| Insertion Sort | O(n)       | O(n²)      | O(n²)      |
| Merge Sort     | O(n log n) | O(n log n) | O(n log n) |
| Quick Sort     | O(n log n) | O(n log n) | O(n²)      |

---

## 🧠 Recursion

### Time

- Depends on recursion tree

### Space

- O(depth of recursion)

### Interview Notes

- Always identify base case
- Stack overflow risk

---

## 🎯 Final Interview Tip

If stuck:

- Count loops
- Identify DS used
- Explain reasoning out loud

Understanding **why** > memorizing **what**

---
