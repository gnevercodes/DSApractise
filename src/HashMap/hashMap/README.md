## hashmap

### hashcode

1. Object class this belongs to
2. the hash value of a number is number itself.

## general idea:

1. The values inserted are converted into **hashcode** and then inserted into the array(say).
2. But **hashcode** gives us big number which is not good.
3. THen **hashing** comes into place which reduces the value into simpler values which are then put into array.
4. Hashcode takes O(1) complexity.
5. `collision` can also occur in Hashmap (mulitple hash values are same which collide to be in the place).

## 2 ways to reduce collision

1.  Chaining
2.  Open addressing

- Chaining :

1. Here, the same keys are being created as Linkedlist (whole point of HashMap is gone).
2. worst case : all the values are then at the same key.
3. We keep on adding to the same plaace which then creates 'traversing'.

> solution : we try to cheat by using `simple uniform hashing`
> Assumption : **every key is equally likely to every slot in the table**.

```
n = no of keys
m = size of table.
load factor : alpha = n/m = expected number of keys per slot.

total TC : O(1+alpha) assuming alpha for LL .

Hash Function :
1. Division Method h(k)=k%m ; m = size of array,m can be taken as prime also .
2. Multiplication methond : h(k) = [(a.k)% 2^w]>>(w-r) a:random w:bits in k ,m:2^r ; popular.
3. Universal Hashing : h(k) = [(ak+b)%p]%m ; a,b:random ,
```

## how large should the array / table should be ?

> size of table should be m = Theta(n) ;

1. big : wasteful
2. small : slow
3. general idea : Start small and grow. if table is small , full : **double and add all items**.O(n) TC.
4. Shrinking is also done .

- `Open Addressing`

1. only one item per slot.
2. hash function tries to probe and try to find empty slots , we look at the next possible item and insert .

probing Strategies:

- linear probing. problem : clustering.
- Double Hashing : (hash1 + i \* hash2)%m ;

## when to use which method :

1. Opem addressing : better cache perf
2. chaining : less sensitive to hashfunction.

```java
private transient HashMap<E,Object> map; // internal implemenation.
private static final Object PRESENT = new Object();

HashSet<String> set = new HashSet<>();
set.add("Java");
set.add("Python");
set.add("Java"); // duplicate


map.put("Java", PRESENT);
map.put("Python", PRESENT);
map.put("Java", PRESENT); // overwrites → no duplicate
```

## Array + Bucket Concept of Hashmap and HashSet

1. Hashmap is basically an array of buckets.
2. each index of any array is called a bucket.
3. map.put("Java", 1); for this.
4. Call hashCode() on key (internally).
5. Convert hash to index
6. Go to that bucket (array index)
   7 . place : a bucket can contain NODE,LINKEDLIST(Collsion),red-black Tree(Many Collisions).

```
Array (table)
Index 0 → null
Index 1 → Node → Node → Node   (LinkedList)
Index 2 → Node
Index 3 → TreeNode (Red-Black Tree)
```

## hashcode vs equals()

- hashcode()
  - returns int,used to find index of bucket.
  - fast.
  - no guarantee in uniqueness.
- equalus()
  - slow , compares actual content, final for equal check.
    -Same hashCode() ≠ equals true (collision allowed)

# HashMap.

1. stores key value pairs
2. No order guaranteed.
3. allows `one null key and multiple null values`.
4. not thread safe : Not Synchronized.
5. TC : O(1) for get / put , worst case is O(n) for traversal and hash collison.
6. Internally : it uses **array Buckets + LinkedList / Tree**.

```java
Map<String, Integer> map = new HashMap<>();
map.put("Alice", 90);
map.put("Bob", 85);
map.put(null, 100);
System.out.println(map); // order is unpredictable
```

# LinkedHashMap

1. maintains insertion order.
2. One null key , multiple null values.
3. not thread safe.
4. TC : O(1) get/put average.
5. internalls : Hashmap + Double linkedLIst.

```java
LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
linkedMap.put("Alice", 90);
linkedMap.put("Bob", 85);
linkedMap.put("Charlie", 95);
System.out.println(linkedMap); // prints in insertion order
```

# TreeMap:

1. Sorted order of keys .
2. no null keys allowed.
3. multiple null values.
4. O(logn) for get/put (uses RedBlack Tree internally).

# HashTable

1. legacyclass.
2. synchronized.
3. No null keys or null values.
4. O(1)
5. Internals : SImilar to hashmap.
