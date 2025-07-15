
public class main {

    public static void main(String[] args) throws Exception {
        customStack stack = new dynamicStack(5);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.peek();
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
