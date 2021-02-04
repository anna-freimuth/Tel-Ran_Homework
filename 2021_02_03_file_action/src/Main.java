import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        CapitalLetterFileAction cp = new CapitalLetterFileAction(new FileOperations());
        cp.handleFile("2021_02_03_file_action/src/test_text.txt");
        ReplaceInFileAction rs = new ReplaceInFileAction((new FileOperations())," ","*");
        rs.handleFile("2021_02_03_file_action/src/test_text.txt");
    }

}
