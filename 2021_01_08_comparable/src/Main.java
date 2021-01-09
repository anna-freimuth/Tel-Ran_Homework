import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<News> news = Arrays.asList(
                new News("Hello world", 9),
                new News("New mobile phone", 5),
                new News("Bitcoin", 9)
        );

        Collections.sort(news);
        Arrays.sort(news.toArray());

        System.out.println(news);
    }
}
