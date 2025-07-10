
public class doublelink {

    private Node head; // default is null
    private Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);

        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;
    }

    public void displayForwardBackward() { // ! printing from first and last. 
        Node node = head; // temporary variable. 
        Node last = tail;
        while (node != null) {
            System.out.print(node.value + "->");
            last = node; // this is important as we move to each node , we assign it last ; 
            node = node.next; // jump to the next node; 

        }
        System.out.println("end");
        // the above last node helps us traverse backwards. 
        System.out.println("print in reverse");
        while (last != null) {
            System.out.print(last.value + "->");
            last = last.previous;
        }
        System.out.println("end");
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;

        }
        last.next = node;
        node.previous = last;

    }

    // ! class node creation here , everything is private here . 
    private class Node {

        private int value;
        private Node next;
        private Node previous;

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public Node(int value) {
            this.value = value;
        }

    }
}
