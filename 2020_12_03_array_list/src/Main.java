public class Main {
    public static void main(String[] args) {

        OurArrayList<String> strings = new OurArrayList<>();

        strings.addLast("Vasya");
        strings.addLast("");

        String str1 = (String) strings.get(0);
        String str2 = (String) strings.get(1);

        String res = "";

        for (int i = 0; i < strings.size(); i++) {
            res += strings.get(i);
        }
    }
}
