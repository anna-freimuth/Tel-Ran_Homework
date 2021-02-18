import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listWithDuplicates = Arrays.asList("movie", "fitness", "fitness", "restaurant", "bowling", "bowling");
        Function<List<String>, List<String>> task1 = (listWithoutDuplicates) -> listWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(task1.apply(listWithDuplicates));

        final int a = 2;
        final int b = 3;
        final int c = 4;
        Function<Integer, Integer> task2 = (x) -> a * x * x + b * x + c;

        printCallback(task2);
    }

    private static void printCallback(Function<Integer, Integer> callback) {
        System.out.println(callback.apply(5));
    }
}
