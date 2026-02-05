package timeComplexity.recapBasics;

public class staticInitalization {

    static int a = 4;
    static int b;

    static { // ! runs first only when the classes is loaded only for once. 
        System.out.println("this loads up when it is compiled once?");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticInitalization one = new staticInitalization();
        System.out.println(staticInitalization.a + " " + staticInitalization.b);

        staticInitalization.b += 3;
        System.out.println(staticInitalization.a + " " + staticInitalization.b);

    }
}
/* 
 * follow inner class method to gain good understanding of how static in inner classes works.
 * works at class level stuff compile time. 
 */
