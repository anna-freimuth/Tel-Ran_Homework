import java.util.Comparator;
import java.util.Locale;

public class FootballClub {

    String country;
    String name;
    int achievedPoint;

    public FootballClub(String country, String name, int achievedPoint) {
        this.country = country;
        this.name = name;
        this.achievedPoint = achievedPoint;
    }

    public static CountryAchievedPointNameComparator getCountryAchievedPointsNameComparator() {

        return new CountryAchievedPointNameComparator();
    }


    private static class CountryComparator implements Comparator<FootballClub> {

        @Override
        public int compare(FootballClub o1, FootballClub o2) {

            return o1.country.toLowerCase(Locale.ROOT).compareTo(o2.country.toLowerCase(Locale.ROOT));
        }
    }

    private static class AchievedPointComparator implements Comparator<FootballClub> {

        @Override
        public int compare(FootballClub o1, FootballClub o2) {
            return o2.achievedPoint - o1.achievedPoint;
        }
    }

    private static class NameComparator implements Comparator<FootballClub> {

        @Override
        public int compare(FootballClub o1, FootballClub o2) {
            return o1.name.toLowerCase(Locale.ROOT).compareTo(o2.name.toLowerCase(Locale.ROOT));
        }
    }

    private static class CountryAchievedPointNameComparator implements Comparator<FootballClub> {

        @Override
        public int compare(FootballClub o1, FootballClub o2) {
            int comparison = new CountryComparator().compare(o1, o2);
            int comparisonPoints = new AchievedPointComparator().compare(o1, o2);
            return comparison != 0 ? comparison :
                    comparisonPoints != 0 ? comparison :
                            new NameComparator().compare(o1, o2)
                    ;
        }
    }
}
