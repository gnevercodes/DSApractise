// package timeComplexity.roadmapsh;

public class methodchaining {

    public static void main(String[] args) {
        String result = "  hello world  "
                .trim()
                .toUpperCase()
                .substring(0, 5); // here each method returns a string so chaining is heppening. 

        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" ").append("world");
        // list.stream()
        //         .filter(x -> x > 10)
        //         .map(x -> x * 2)
        //         .forEach(System.out::println);
    }
}
