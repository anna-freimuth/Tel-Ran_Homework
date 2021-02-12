package operation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationContext {
    private Map<String, IStringOperation> operationByName;

//    {
//        IStringOperation upperCase = new UpperCaseSO();
//        IStringOperation lowerCase = new LowerCaseSO();
//        operationByName = new HashMap<>();
//        operationByName.put(upperCase.getName(), upperCase);
//        operationByName.put(lowerCase.getName(), lowerCase);
//    }
public OperationContext() {
}

    public OperationContext(List<String> operationPaths) {
        // TODO compose 'operationByName' by the paths to the necessary operations
    }
    public IStringOperation getOperation(String name) {
        return operationByName.get(name);
    }
}
