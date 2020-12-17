public class StringConcatenator implements IConcatenator {

    @Override
    public void concatenate(String[] strings) {

        String res = "";
        for (String string : strings) {
            res += string;
        }
    }
}
