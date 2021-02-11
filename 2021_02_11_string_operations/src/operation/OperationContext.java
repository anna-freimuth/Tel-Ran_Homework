package operation;

import java.util.HashMap;
import java.util.Map;

public class OperationContext {
    private Map<String, IStringOperation> operationByName;

    {
        IStringOperation upperCase = new UpperCaseSO();
        IStringOperation lowerCase = new LowerCaseSO();
        operationByName = new HashMap<>();
        operationByName.put(upperCase.getName(), upperCase);
        operationByName.put(lowerCase.getName(), lowerCase);
    }

    public IStringOperation getOperation(String name) {
        return operationByName.get(name);
    }
}
