
abstract class recapdeletsoon {

    abstract public void makeNoise();

    abstract public void eat(); // these exist solely for polymorphism . 

    abstract public String sound();

    public void normalMethod() {
        System.out.println(" non abstract classes can too exist");
    }
}

class Dog extends recapdeletsoon {

    @Override
    public void makeNoise() {
        System.out.println(" woof ");
    }

    @Override
    public void eat() {
        System.out.println("eats dog food");
    }

    @Override
    public String sound() {
        return "barks";
    }
}

