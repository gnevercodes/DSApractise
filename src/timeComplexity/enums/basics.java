package timeComplexity.enums;

public class basics {

    enum week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // These are the enum constants
        // these are all public , static and final . 

        // since it is final we cannot create child enums .
        // type is week now 
    }

    public static void main(String[] args) {
        week wweek;
        wweek = week.Monday;

        for (week day : week.values()) {
            System.out.println(day);
        }
    }

}
