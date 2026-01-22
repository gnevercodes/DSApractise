## Method chaining :

> Method chaining = calling multiple methods in one line, one after another, where each method returns an object that allows the next method to be called.

```
class Car {
    String brand;
    String color;
    int speed;

    Car setBrand(String brand) {
        this.brand = brand;
        return this;   // 🔑 key
    }

    Car setColor(String color) {
        this.color = color;
        return this;
    }

    Car setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
}

Car car = new Car().setBrand("BMW").setColor("Black").setSpeed(123);
```

## Encapsulation:

> encapsulation helps us in ** readonly classes ** and in **writeonlyclasses**.

## Static vs Dynamic Binding

> Binding = connecting a method call to the method implementation.In simple words:When you call a method, Java has to decide WHICH method to run.

1. Static Binding : happens at compile time : **static methods, final,private methods , methods overloading**
2. Dynamic Binding : happens at run time. **non-static methods,non final,non-private,methodoverriding**.
