package Java11.TimeUnits;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Demo {
    public static void main(String[] args) {
        //Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        //add 1 week to the current date
        LocalDate today1 = LocalDate.now();
        LocalDate nextWeek = today1.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        //add 1 month to the current date
        LocalDate today2 = LocalDate.now();
        LocalDate nextMonth = today2.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        //add 1 year to the current date
        LocalDate today3 = LocalDate.now();
        LocalDate nextYear = today3.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);
    }
}
