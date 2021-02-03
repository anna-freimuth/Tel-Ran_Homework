import java.util.List;

public class ReplaceSpaceToStarsFileAction extends FileAction {
    private String pattern;
    private String target;

    protected ReplaceSpaceToStarsFileAction(FileOperations fileOperations, String pattern, String target) {
        super(fileOperations);
        this.pattern = pattern;
        this.target = target;
    }

    /**
     * Replace all occurrences of "pattern" to "target"
     *
     * @param text
     * @return
     */
    @Override
    protected List<String> perform(List<String> text) {
        return null;
    }
}
