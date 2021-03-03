package tasks;

import java.time.LocalDate;


import static java.time.temporal.ChronoUnit.DAYS;

public class BirthdayAndNewYear {
    public static void main(String[] args) {

        //task 1
        LocalDate myCatBirthday = LocalDate.of(2019, 8, 17);
        System.out.println(myCatBirthday.getDayOfWeek());
        System.out.println(myCatBirthday.getDayOfYear());

        LocalDate myCatBirthdayThisYear = LocalDate.of(2021, 8, 17);
        LocalDate now = LocalDate.now();

        System.out.println("Birthday was in this year already: " + now.isBefore(myCatBirthdayThisYear));
        System.out.println(DAYS.between(now, myCatBirthdayThisYear) + " days until next birthday this year, version1");
        //or
        System.out.println((myCatBirthdayThisYear.minusDays(now.getDayOfYear()).getDayOfYear() + " days until next birthday this year, version2"));

        // task 2
        LocalDate newYear = LocalDate.MAX;
        System.out.println(newYear.minusDays(now.getDayOfYear()).getDayOfYear() + " days left until New Year");
    }
}
