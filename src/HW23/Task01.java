package HW23;

public class Task01 {
    public static void main(String[] args) {

        System.out.println(repeatSeparator("Word", "X", 3)); //→ "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2)); // → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1)); //→ "This"
    }

    private static String repeatSeparator(String word, String separator, int countOccurrencesOfWord) {
        String bigString = "";
        for (int i = 1; i <= countOccurrencesOfWord; i++) {
            bigString = bigString + word;
            if (i != countOccurrencesOfWord) bigString = bigString + separator;
        }
        return bigString;
    }
}


