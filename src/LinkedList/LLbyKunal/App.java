
public class App {

    public static void main(String[] args) {

        link one = new link();
        one.insertFirst(2);
        one.insertFirst(3);
        one.insertLast(88);
        one.insert(77, 3);
        one.display();
        System.out.println(one.deleteFirst());
        one.display();
    }
}
