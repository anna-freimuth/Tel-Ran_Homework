
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {

        TernaryIntPredicate ternaryIntPredicate = ((a, b, c) -> a != b && b != c && c != a);
        System.out.println((ternaryIntPredicate.test(1, 2, 3)));
        System.out.println((ternaryIntPredicate.test(6, 5, 6)));

        Function<Integer, Integer> f = x -> x * 2;
        Function<Integer, Integer> g = x -> x + 3;
        //Function<Integer,Integer> h =  f.compose(g);  //  f(g(x)) = g(x) * 2 =(x + 3) * 2 = 2x + 6
        Function<Integer, Integer> h = x -> f.apply(g.apply(x));
        System.out.println(h.apply(10));

        //Predicates intersection
        PredicatesIntersect predicatesIntersect = new PredicatesIntersect();
        Predicate<Double> x1 = (x -> x % 2 == 0);
        Predicate<Double> y1= (x -> x % 3 == 0);
        Predicate<Double> z1 = (x -> x < 30);
        List<Predicate<Double>> list = Arrays.asList(x1, y1, z1);
        System.out.println(predicatesIntersect.intersect(list).test(12d));
        System.out.println(predicatesIntersect.intersect(list).test(30d));
    }
}
