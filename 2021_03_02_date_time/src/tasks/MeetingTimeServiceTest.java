package tasks;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTimeServiceTest {
    MeetingTimeService meetingTimeService = new MeetingTimeService();

    @Test
    public void test_intersectWorkingTime_overlap() throws NoOverlapException {

        LocalTime start = LocalTime.of(8, 0);
        int end = 8;
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZoneId petersburg = ZoneId.of("Europe/Moscow");

        int result = meetingTimeService.intersectWorkingTime(start, end, berlin, start, end, petersburg);

        // test may fail when Germany changes to summer time
        assertEquals(6, result);
    }

    @Test
    public void test_intersectWorkingTime_noOverlap() throws NoOverlapException {

        LocalTime start = LocalTime.of(8, 0);
        int end = 1;
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZoneId petersburg = ZoneId.of("Europe/Moscow");

        assertThrows(NoOverlapException.class, () -> meetingTimeService.intersectWorkingTime(start, end, berlin, start, end, petersburg));
    }
}
