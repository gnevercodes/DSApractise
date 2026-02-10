
class link {

    private Node head;
    private Node tail;

    private int size;

    public link() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head; // linking 
        head = node; // assigning head to the first new element ! it can stay over the previous node 
        if (tail == null) { // if only one node is present. 
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;

        }
        size--;
        return value;
    }

    public int deletLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    // ! single linkedlist; 
    // TODO : create a NODE 
    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            // this.next = next;
        }

        public Node(Node next) {
            this.next = next;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
