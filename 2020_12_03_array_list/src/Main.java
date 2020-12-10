import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        OurArrayList<String> strings = new OurArrayList<>();

        strings.addLast("Mira");
        strings.addLast("Kira");
        strings.addLast("Mark");
        strings.addLast("Arnold");

        // non static nested class
        // every instance of ForwardIterator is dependant on an instance of OurArrayList,
        // which is 'strings' in our case
        Iterator<String> iterator = strings.forwardIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // static nested class
        iterator = strings.backwardIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        String res = "";

        for (int i = 0; i < strings.size(); i++) {
            res += strings.get(i);
        }
        // Iterable
        for (String str : strings) {
            System.out.println(str);
        }
        // equivalent to:
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()) {
            String str = stringIterator.next();
            System.out.println(str);
        }
    }
}
