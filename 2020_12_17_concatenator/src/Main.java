public class Main {

    public static void main(String[] args) {
        // time test
//        String res = "";
//        long beforeConcatenation = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            res += "String";
//        }
//        long timeConcatenated = System.currentTimeMillis() - beforeConcatenation;
//        System.out.println(timeConcatenated);

        //String Builder
//        StringBuilder builder = new StringBuilder();
//        builder.append("String")
//                .append(" ")
//                .append("Another");
//
//        builder.append("String");
//        builder.append(" ");
//        builder.append("Another");
//
//        String str = builder.toString();
//        System.out.println(str);

        IConcatenator concatenatorString = new StringConcatenator();
        IConcatenator concatenatorStringBuilder = new StringBuilderConcatenator();
        IConcatenator concatenatorStringBuffer = new StringBufferConcatenator();


        ConcatenationTester stringTester = new ConcatenationTester(concatenatorString);
        ConcatenationTester stringBuilderTester = new ConcatenationTester(concatenatorStringBuilder);
        ConcatenationTester stringBufferTester = new ConcatenationTester(concatenatorStringBuffer);

        int amount = 10000;
        String text = "String";

        stringTester.test(amount, text);
        stringBuilderTester.test(amount, text);
        stringBufferTester.test(amount, text);

    }
}
