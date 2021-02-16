package operation;

import java.lang.reflect.InvocationTargetException;
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

    public OperationContext(List<String> operationPaths) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        operationByName = new HashMap<>();
        for(String path : operationPaths) {
            IStringOperation operation = (IStringOperation) Class
                    .forName(path)
                    .getConstructor()
                    .newInstance();
            operationByName.put(operation.getName(),operation);
        }
    }
    public IStringOperation getOperation(String name) {
        return operationByName.get(name);
    }
}
