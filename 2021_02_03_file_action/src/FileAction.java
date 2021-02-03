import java.io.IOException;
import java.util.List;

public abstract class FileAction {

    final FileOperations fileOperations;

    protected FileAction(FileOperations fileOperations) {
        this.fileOperations = fileOperations;
    }

    protected abstract List<String> perform(List<String> text);

    /**
     * The method receives a filename and must read th file into a {@link List} of Strings,
     * calls the "perform" method, then writes the result back to file.
     *
     * @param filename name of the file to handle
     */
    public void handleFile(String filename) throws IOException {

        FileOperations fileOperations = new FileOperations();
        List<String> text = fileOperations.readToList(filename);
        fileOperations.writeList(perform(text), filename);
    }
}
