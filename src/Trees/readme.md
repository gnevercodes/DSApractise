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

## Types of Binary Tree.

1. _Complete Binary Tree_ : All levels are filled apart from last level , which is filled from left to right.
2. **Full Binary Tree** : each nodes has zero or two children .
3. **perfect Binary tree** : all the levels are filled.
4. Height balanced .
5. Skewed Binary Tree. every node has only one child. height : O(n) like LL.
6. Ordered Binary Tree : every node has some property .

## Properties: (INTERVIEWS)

1. total no of nodes in a perfect binary tree for height h : 2^(h+1) -1 ;
2. if level=i ; then nodes : 2^i
3. total leaf nodes in PBT : 2^h ;
4. N=no of leaves , log(n+1) levels atleast.

## Binary Search Tree.

1.
