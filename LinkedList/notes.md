A LinkedList is a linear data structure where each element (called a node) contains:
	•	The data itself
	•	A reference (pointer) to the next node in the sequence

Unlike arrays, elements in a LinkedList are not stored in contiguous memory. Instead, they’re linked together using pointers, allowing for efficient insertions and deletions without shifting elements.

⸻

💡 Key Features:
	•	Dynamic size — grows and shrinks at runtime
	•	Efficient insertions/deletions (especially at beginning or middle)
	•	Slower access than arrays (O(n) to find elements)
	•	Built using self-referential classes (e.g., Node class pointing to another Node)
