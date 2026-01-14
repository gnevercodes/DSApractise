
public class newone {

    // inheritence
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Tiger();
        animals[0].eat();
        vet one = new vet();
        one.giveFluShot(animals[0]);
    }
}

class Animal {

    String food;
    Boolean hungry;
    String location;

    public void makeNoise() {

    }

    public void eat() {
        //eating
    }

    public void roam() {

    }
}

class Feline extends Animal {

    public void roam() {
    }

}

class Lion extends Feline {

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {
        super.eat();
        // do your stuff here then again
        System.out.println("eat here");
    }
}

class Tiger extends Feline {

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {
        // eating
        System.out.println("eating");
    }
}

class Canine extends Animal {

    public void roam() {
        // idk roams in a strange way ig;///
    }
}

class wolf extends Canine {

    @Override
    public void makeNoise() {
        // 
    }

    public void eat() {
        System.out.println("eat");
    }
}

class vet {

    public void giveFluShot(Animal a) {
        // gives a flue shot 
        System.out.println("animal's recieving a flu shot");
    }
}
