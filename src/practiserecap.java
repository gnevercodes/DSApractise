
public class practiserecap {

    private Node head;
    private Node tail;

    public static void main(String[] args) {

    }

    // !  first create a node with value and a next pointer.
    class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

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
