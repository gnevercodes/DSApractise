package timeComplexity.comparable;

public class Main {

    public static void main(String[] args) {
        Student one = new Student("ganesh", 21);
        Student two = new Student("rahul", 44);

        if (one.compareTo(two) < 0) {
            System.out.println("rahul has more greater rollno  than ganesh");
        }

    }
}
