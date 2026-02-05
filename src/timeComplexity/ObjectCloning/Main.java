package timeComplexity.ObjectCloning;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human one = new Human(34, "ganesh");
        // Human twin = new Human(one);
        // ! instead of the above one 
        // takes more processing
        // ! we will be doing this.  
        Human twin = (Human) one.clone();
    }

}
