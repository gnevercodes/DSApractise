// SINGLY LINKED LIST IMPLEMENTATION


public class MyLinkedlist {

    Node head;

    public void add(int data) {

        Node node = new Node(); // creating 1st , 2nd , 3rd nodes and soo on . 
        node.data = data; // addign the data frm RUNNEr --> MyLinkedList --> Node ; by obj
        if (head == null) { // checking if the node is the first one or not . 
            head = node;
        } else {
            Node n = head; // adding a other node and making it head / assume it as second node.
            while (n.next != null) {

                n = n.next;
            }
            n.next = node;
        }

    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
