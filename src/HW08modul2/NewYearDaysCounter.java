package HW08modul2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NewYearDaysCounter {
    public static void main(String[] args) {
        System.out.println(newYearDaysCount());
    }

    public static LocalDate getDateInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date, from which you want to count days until next New Year (yyyy-MM-dd)");
        String date = input.next();
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static long newYearDaysCount() {
       LocalDate userDate = getDateInput();
       LocalDate newYear = LocalDate.of(userDate.getYear() + 1, 1, 1).minusDays(1);
       Duration duration = Duration.between(userDate.atStartOfDay(), newYear.atStartOfDay());
        return duration.toDays();
    }

}

