package timeComplexity.ObjectCloning;

public class Human implements Cloneable {

    private int age;
    private String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;

    }

    Human(Human other) {
        other.age = age;
        other.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
