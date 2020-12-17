public class StringBufferConcatenator implements IConcatenator {
    @Override
    public void concatenate(String[] strings) {
        StringBuffer buffer = new StringBuffer();

        for (String string : strings) {
            buffer.append(string);
        }
        buffer.toString();
    }
}
