import java.util.Arrays;
import java.util.Set;

public class Censor {
    private final Set<String> dictionary;

    public Censor(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    public boolean verify(String text){
        String[] res = text.split(" ");

        return Arrays.stream(res)
                .map(String::toLowerCase)
                .anyMatch(dictionary::contains)
        ;
    }
}
