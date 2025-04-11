package practice.extra;
//Print the Days of the Week Without Using Any String Literals
//Write a program that prints the days of the week (Monday, Tuesday, ...) without using string literals in your code.
public class Days {
        // Define an enum for the days of the week
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        public static void main(String[] args) {
            // Loop through the enum values and print each one
            // enhanced for loop (in here Day values will be stored to days and can be accessed using days)
            for (Day days : Day.values()) {
                System.out.println(days);
            //normal for loop to print days.
//              Day[] days = Day.values();
//              for (int i = 0; i < days.length; i++) {
//                    System.out.println(days[i]);
                }
        }


}

