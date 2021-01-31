import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOperations {
    /**
     * Writes the list of strings into the file, clearing it if the file exists and starts every string from
     * new line
     *
     * @param strings
     * @param filename
     */
    public void writeString(List<String> strings, String filename) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {

            String string = String.join("\n", strings);
            outputStream.write(string.getBytes());
        }
    }

    /**
     * reads all the lines of the file into a list
     *
     * @param filename
     * @return list of lines
     */
    public List<String> readString(String filename) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(filename)) {

            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);

            String readData = new String(bytes);
            String[] stringData = readData.split("\n");
            return Arrays.asList(stringData);
        }
    }

    public void writeBytes(byte[] bytes, String filename) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            outputStream.write(bytes);
            //here do not need to close manually(closes automatically)
        }
//        try {
//            outputStream.write(bytes);
//        } finally {
//            outputStream.close();  //need to close
//        }
    }

    public byte[] readBytes(String filename) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(filename)) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            return bytes;
        }

    }

    /**
     * Writes the list of number into the file with " " as a delimiter. [12, 35, 3534] -> "12 35 3534"
     *
     * @param numbers  to write into the file
     * @param filename
     */
    public void writeInts(List<Integer> numbers, String filename) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {

            List<String> stringList = new ArrayList<>();

            for (Integer integer : numbers) {
                stringList.add(String.valueOf(integer));
            }
            String finalString = String.join(" ", stringList);
            outputStream.write(finalString.getBytes());
        }
    }

    /**
     * The file contains data in the following format: "12 35 3534"
     *
     * @param filename
     * @return
     */

    // Integer.parseInt
    public List<Integer> readInts(String filename) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(filename)) {

            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);

            String readData = new String(bytes);
            String[] stringData = readData.split(" ");
            List<Integer> result = new ArrayList<>();
            for (String string : stringData)
                result.add(Integer.parseInt(string));

            return result;
        }
    }
}
