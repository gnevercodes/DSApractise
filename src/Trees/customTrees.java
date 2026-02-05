
import java.util.Scanner;

public class customTrees { // ! Binary Tree. 

    private Node root;

    public customTrees() {

    }

    //Insert Elements:
    public void populate(Scanner scanner) {
        System.out.println("enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root); // goes from here to popualate(scanner,node). 
    }

    // ! very logical code. (TREES + CALLStack)
    public void populate(Scanner scanner, Node node) {
        System.out.println("do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value to the left" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);// calling the recursion again. 

        }
        System.out.println("do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the value to the right" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);// calling the recursion again. 

        }

    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    private static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        customTrees tres = new customTrees();
        tres.populate(scanner);
    }

}
