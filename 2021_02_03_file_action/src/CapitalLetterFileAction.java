import java.util.ArrayList;
import java.util.List;

public class CapitalLetterFileAction extends FileAction {
    public CapitalLetterFileAction(FileOperations fileOperations) {
        super(fileOperations);
    }

    @Override
    protected List<String> perform(List<String> text) {
        List<String> result = new ArrayList<>();
        for(String str : text){
            result.add(str.toUpperCase());
        }
        return result;
    }
}
