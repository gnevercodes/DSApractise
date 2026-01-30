# Trees

`prerequisites : recursion , OOP `.

- recursion is needed to solve tree problems.

## why trees?

> many nodes are connected together.

1. insertion , deletion , find elements in O(log(n)) times.
2. ordered inseriton and deletion.
3. cost efficient.

Limitation :

1. unbalanced binary tree.
2. `inefficient for sorted data.`

use cases:

1. file systems.(folders).
2. data bases.(AVL: fast retrieval of data).
3. algorithms : Networking.

### how to solve this problem .

1. self balancing binary tree.
2.

## **Implementation** :

1. we create nodes like LL but it has three things.
2. value , LEFT , RIGHT.

```java
class Node{
    int value;
    Node left ;
    Node right;
}
```

3. SIze : TOTAL NODES.
4. Child , parent . siblings.
5. Edge : NOde connection line.
6. Height : MAX no of edges between two nodes.(count from bottom to up).
7. Leaf Nodes : edge nodes.
8. Level : difference between two nodes.
9. ancestor , descendant.
10.
