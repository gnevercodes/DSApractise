package timeComplexity.recapBasics;

public class statics {

    public static void main(String[] args) {
        Human one = new Human(22, "ganesh", 45000, false);
        Human two = new Human(22, "ganesh", 45000, false);
        System.out.println(one.population);
        System.out.println(two.population);

        statics three = new statics();
        three.greeting(); // ! see here we are referencing a non-static in the static context by ?OBJECT Creation. 
    }

    void greeting() {

    }

}

class Human {

    int age;
    String name;
    int salary;
    boolean marrierd;
    static long population; // this can be accessed before the object is being created also . 

    public Human(int age, String name, int salary, boolean marrierd) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.marrierd = marrierd;
        Human.population += 1; // static variables are apart from instance variables. 
        // * follow convention
    }

}
// ? properties that are not related to the object
/* * NOTES ON STATIC KEYWORD IN JAVA.
 * we know that something which is not static , will be belonging to an object. 
 * so we can't use "non-static" inside a "static."
 * and you can call "static " inside of a "non-static"
 *  when inner classes are there , outside classes can't be static
 *  only inner can be static
 */
