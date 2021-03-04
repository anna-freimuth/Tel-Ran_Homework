package tasks;

import java.time.*;
import java.time.temporal.ChronoUnit;


public class MeetingTimeService {

    public int intersectWorkingTime(LocalTime start1, int hours, ZoneId zone1, LocalTime start2, int hours2, ZoneId zone2) throws NoOverlapException {
        ZonedDateTime office1Start = ZonedDateTime.of(LocalDateTime.of(LocalDate.now(), start1), zone1);
        ZonedDateTime office1End = office1Start.plus(hours, ChronoUnit.HOURS);
        ZonedDateTime office2Start = ZonedDateTime.of(LocalDateTime.of(LocalDate.now(), start2), zone2);
        ZonedDateTime office2End = office2Start.plus(hours2, ChronoUnit.HOURS);

        ZonedDateTime start = office1Start.isBefore(office2Start) ? office2Start : office1Start;
        ZonedDateTime end = office1End.isAfter(office2End) ? office2End : office1End;

        int result = (int) start.until(end, ChronoUnit.HOURS);

        if (result <= 0)
            throw new NoOverlapException();

        return result;
    }
}
