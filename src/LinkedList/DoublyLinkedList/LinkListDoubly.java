
public class LinkListDoubly {

    NodedoubleL head = null;
    NodedoubleL tail = null;

    // head and tail are both null at initialiation ; 
    public void add(int data) {

        NodedoubleL node = new NodedoubleL(data);
        if (head == null) {
            head = tail = node;

        } else {
            tail.next = node; // this nodes tail points to new created node 
            node.prev = tail; // new node's prev points to tail of node
            tail = node; // tail is assigned to new node ; 

        }
    }

    public void show() {
        NodedoubleL temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
        //System.out.println("null");
    }

    public void insertAtFirst(int data) {
        NodedoubleL node = new NodedoubleL(data);
        if (head == null) {
            head = tail = node;

        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }

    }

}
