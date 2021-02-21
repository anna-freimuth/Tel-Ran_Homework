
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {

        TernaryIntPredicate ternaryIntPredicate = ((a, b, c) -> a != b && b != c && c != a);
        System.out.println((ternaryIntPredicate.test(1, 2, 3)));
        System.out.println((ternaryIntPredicate.test(6, 5, 6)));

        Function<Integer, Integer> f = x -> x * 2;
        Function<Integer, Integer> g = x -> x + 3;
        //Function<Integer,Integer> h =  f.compose(g);  //  f(g(x)) = g(x) * 2 =(x + 3) * 2
        Function<Integer,Integer> h = x -> f.apply(g.apply(x));
        System.out.println(h.apply(10));
    }
}
