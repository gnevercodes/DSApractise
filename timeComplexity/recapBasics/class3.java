package timeComplexity.recapBasics;

public class class3 {

    public static void main(String[] args) {
        Box box = new Box(4);
        System.out.println(box.l + " " + box.w + " " + box.h);
        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.h + " " + box2.weight);
    }

}

class Box {

    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side) {
        this.w = side;
        this.h = side;
        this.l = side;

    }

    Box(double l, double w, double h) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

}

class BoxWeight extends Box {

    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h) {
        super(l, w, h);
    }

}
