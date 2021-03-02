import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // LocalDate
        LocalDate now = LocalDate.now();
        System.out.println(now);
        // plus/minus
        LocalDate tomorrow = now.plus(Period.ofDays(1));
        System.out.println(tomorrow);
        tomorrow = now.plusDays(1);
        System.out.println(tomorrow);
        tomorrow = now.plus(1, ChronoUnit.DAYS);
        //tomorrow = now.plus(1, ChronoUnit.MONTHS);
        System.out.println(tomorrow);
        //different getters
        System.out.println("Today is: " + now.getDayOfWeek() + " day of week");
        // isAfter/isBefore
        System.out.println(now.isAfter(tomorrow));
        System.out.println(System.currentTimeMillis());
        //System.out.println(now.toEpochSecond(LocalTime.now(), ZoneOffset.UTC));

        // LocalTime
        LocalTime currentTime = LocalTime.now();
        LocalTime nextHour = currentTime.plus(Duration.ofHours(1));
        System.out.println(nextHour);
        nextHour = currentTime.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour);
        nextHour = currentTime.plusHours(1);
        System.out.println(nextHour);
        System.out.println(currentTime.isBefore(nextHour));

        // LocalDateTime
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime fromDateAndTime = LocalDateTime.of(now, currentTime);
        System.out.println(fromDateAndTime);
        LocalDateTime parsed = LocalDateTime.parse("2021-03-02T12:25:53");
        System.out.println(today);
        System.out.println(parsed);
        System.out.println(parsed.get(ChronoField.DAY_OF_YEAR));
        // with
        LocalDateTime yearAgo = today.with(ChronoField.YEAR, 2020);
        System.out.println("Year ago: " + yearAgo);

        // ZoneDateTime
        System.out.println(ZoneId.getAvailableZoneIds());
        ZonedDateTime minskMorning = ZonedDateTime.of(
                LocalDateTime.of(2021, Month.MARCH, 2, 6, 0),
                ZoneId.of("Europe/Minsk")
        );
        System.out.println(minskMorning);
        ZonedDateTime vladivostokMorning = minskMorning.withZoneSameLocal(ZoneId.of("Asia/Vladivostok"));
        System.out.println(vladivostokMorning);
        ZonedDateTime sameTimeOtherZone = minskMorning.withZoneSameLocal(ZoneId.of("Asia/Vladivostok"));
        System.out.println(sameTimeOtherZone);

        // Differences between times/dates etc
        // for dates
        LocalDate plusHalfYear = now.plus(6, ChronoUnit.MONTHS);
        Period period = Period.between(tomorrow, plusHalfYear);
        System.out.println("years: " + period.getYears());   // period contains year, month, day
        System.out.println("months: " + period.getMonths());
        System.out.println("days: " + period.getDays());

        long numberDaysBetweenTomorrowAndPlusHalfYear = ChronoUnit.DAYS.between(tomorrow, plusHalfYear);
        System.out.println(numberDaysBetweenTomorrowAndPlusHalfYear);

        //for time
        Duration duration = Duration.between(currentTime, nextHour);
        System.out.println(duration);    //  period time 1h  PT1H
        System.out.println(ChronoUnit.MINUTES.between(nextHour, currentTime));  // -60
        System.out.println(ChronoUnit.HOURS.between(currentTime, nextHour));

        // Formatting
        LocalDateTime fromStandardString = LocalDateTime.parse("2021-03-02T12:25:53");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println("formatter prints: " + today.format(formatter)); // formatter prints: 2021.03.02

        LocalDate fromPattern = LocalDate.parse("2021.03.02", formatter);
        System.out.println(fromPattern.toString()); //2021-03-02
        System.out.println(fromPattern.format(formatter)); //2021.03.02

    }
}

