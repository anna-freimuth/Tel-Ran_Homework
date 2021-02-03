import java.io.IOException;


public class Main {
    private static Object FileOperations;

    public static void main(String[] args) throws IOException {

        CapitalLetterFileAction cp = new CapitalLetterFileAction((FileOperations) FileOperations);
        cp.handleFile("2021_02_03_file_action/src/test_text.txt");
        ReplaceSpaceToStarsFileAction rs = new ReplaceSpaceToStarsFileAction((FileOperations) FileOperations," ","*");
        rs.handleFile("2021_02_03_file_action/src/test_text.txt");
    }

}
