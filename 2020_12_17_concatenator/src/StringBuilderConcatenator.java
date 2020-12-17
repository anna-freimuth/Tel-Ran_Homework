public class StringBuilderConcatenator implements IConcatenator {
    @Override
    public void concatenate(String[] strings) {
        StringBuilder builder = new StringBuilder();

        for (String string : strings) {
            builder.append(string);
        }
        builder.toString();
    }
}
