import operation.IStringOperation;
import operation.UpperCaseSO;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //how to create an instance of a class by its name

        String operationPath = "operation.UpperCaseSO";
        IStringOperation operation = (IStringOperation) Class
                .forName(operationPath)
                .getConstructor(String.class,Integer.class)
                .newInstance("Katya",20);



        IStringOperation operation1 = (IStringOperation) Class
                .forName(operationPath)
                .getConstructor()
                .newInstance();

        System.out.println(operation);
        System.out.println(operation1);
    }
}
