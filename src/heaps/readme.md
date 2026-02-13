# Heaps.

## Notes

1. Heap is a speacialized tree that helps you get maximum or the min element.
2. Heap is a `Complete Binary tree`(all levels are filled except the bottem level) with a heap property .

## Types of Heap :

- Min Heap where parent <= children.
- max heap where parent >= children.

## How heap is implemented ?

1. Firstly , it's a complete binary tree meanin all the leaves are being filled.
2. These are then being efficiently stored in the arrays.
3. stored as an array , represented as a TREE.

## Properties:

1. Complete binary Tree.
2. Every Node is >= the children of the node.(val).
3. May not be sorted.

## Methods

- upheap method.
-

# Heaps :

- in java , heaps are implemented using PriorityQueue .
- heap is a complete binary Tree which follows special rule .
- Min heap ( parents <= children)
- max heap ( parents >= childrn).

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add() // pq.offer() ; This takes O(logN) : rearranging has to be done so .
pq.peek() // looks at the top element O(1) .
pq.poll() // removes smallest element and returns O(logn).

PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>((a, b) -> b - a);

PriorityQueue<Integer> maxHeaps =
    new PriorityQueue<>(Collections.reverseOrder()); // much cleaner.
```
