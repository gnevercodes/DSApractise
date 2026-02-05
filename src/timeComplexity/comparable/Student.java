package timeComplexity.comparable;

public class Student implements ComparableGeneric<Student> {

    private String name;
    private int rollno;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

    @Override
    public int compareTo(Student o) {
        int difference = (this.getRollno() - o.getRollno());
        return difference;

    }

    public int getRollno() {
        return rollno;
    }

}
