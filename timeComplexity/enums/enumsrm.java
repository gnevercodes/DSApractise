package timeComplexity.enums;
// we cant do a new on the enum class. 

class now {

    public static void main(String[] args) {
        DaysofTheWeek day = DaysofTheWeek.friday;

        for (DaysofTheWeek myday : DaysofTheWeek.values()) {
            System.out.println(myday);
        }
    }
}
