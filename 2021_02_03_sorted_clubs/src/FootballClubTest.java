import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FootballClubTest {

    FootballClub team1 = new FootballClub("Germany", "Berlin", 3);
    FootballClub team2 = new FootballClub("Germany", "Munich", 4);
    FootballClub team3 = new FootballClub("England", "London", 0);
    FootballClub team4 = new FootballClub("England", "Arena", 6);
    FootballClub team5 = new FootballClub("Italy", "Rome", 9);
    FootballClub team6 = new FootballClub("Italy", "Verona", 9);

    List<FootballClub> shuffledList = Arrays.asList(team4, team2, team6, team3, team1, team5);
    List<FootballClub> orderedList = Arrays.asList(team4, team3, team2, team1, team5, team6);

    @Test
    public void test_sorting_list() {

        shuffledList.sort(FootballClub.getCountryAchievedPointsNameComparator());
        assertEquals(orderedList, shuffledList);
    }
}
