import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //task1
        List<Integer> numbers = Arrays.asList(5, 2, 4);

        Integer sumSquaresOfNumbers = numbers.stream()
                .collect(Collectors.summingInt(number -> number * number));

        Integer multiplicationSquaresOfNumbers = numbers.stream()
                .collect(Collectors.reducing(1, (number, number2)
                        -> number * number2 * number2)

                );

        System.out.println(sumSquaresOfNumbers);
        System.out.println(multiplicationSquaresOfNumbers);

        //task2
        List<String> text = Arrays.asList("hello", "level", "noon", "kayak", "world");

        Predicate<String> isPalindromeText = Main::palindrome;

        Map<Boolean, List<String>> textByPalindrome = text.stream()
                .collect(Collectors.partitioningBy(isPalindromeText));

        System.out.println(textByPalindrome);
    }

    private static boolean palindrome(String text) {
        StringBuilder sb = new StringBuilder(text);

        return sb.reverse()
                .toString()
                .equals(text);
    }
}
