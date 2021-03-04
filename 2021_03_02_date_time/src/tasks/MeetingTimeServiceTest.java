package tasks;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void test_intersectWorkingTime_overlap_Alaska_Kamchatka() throws NoOverlapException {

        LocalTime startAlaska = LocalTime.of(7, 0);
        LocalTime startKamchatka = LocalTime.of(15, 0);
        int end = 15;
        ZoneId alaska = ZoneId.of("America/Anchorage");
        ZoneId kamchatka = ZoneId.of("Asia/Kamchatka");

        int result = meetingTimeService.intersectWorkingTime(startAlaska, end, alaska, startKamchatka, end, kamchatka);

        assertEquals(2, result);
    }

    @Test
    public void test_intersectWorkingTime_overlap_Alaska_Kamchatka_2() throws NoOverlapException {

        LocalTime startAlaska = LocalTime.of(7, 0);
        LocalTime startKamchatka = LocalTime.of(7, 0);
        int end = 5;
        ZoneId alaska = ZoneId.of("America/Anchorage");
        ZoneId kamchatka = ZoneId.of("Asia/Kamchatka");

        int result = meetingTimeService.intersectWorkingTime(startAlaska, end, alaska, startKamchatka, end, kamchatka);

        assertEquals(2, result);
    }
}
