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

        //Integer ten = 10;
        OurInteger ten = new OurInteger(10);

        OurInteger eight = new OurInteger(8);

        if(eight.compareTo(ten)  < 0){
            System.out.println("Eight is lower than ten");
        }else{
            System.out.println("Strange, but eight is greater or equal than ten");
        }
    }
}
