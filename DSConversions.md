# Converting One Data Structure to Another.

1. Array -> List :

```java
int[] arr = {1,2,3};
List<Integer> list = new ArrayList<>();

for (int num : arr) {
    list.add(num);
}
```

2. List -> Array

```java
List<Integer> list = new ArrayList<>();

int[] arr = new int[list.size()];
for (int i = 0; i < list.size(); i++) {
    arr[i] = list.get(i);
}
```

3. Set -> List

```java
Set<Integer> set = new HashSet<>();
List<Integer> list = new ArrayList<>(set);
```

4. Map -> List of Keys

```java
List<Integer> keys = new ArrayList<>(map.keySet());
```

5. Map -> List of Values.

```java
List<Integer> values = new ArrayList<>(map.values());
```

6. Map -> List of Key Value pairs.

```java
List<Map.Entry<Integer,Integer>> list =
    new ArrayList<>(map.entrySet());
```

7. List -> Heap

```java
List<Integer> list = Arrays.asList(5,3,8);

PriorityQueue<Integer> pq =
    new PriorityQueue<>(list);
```
