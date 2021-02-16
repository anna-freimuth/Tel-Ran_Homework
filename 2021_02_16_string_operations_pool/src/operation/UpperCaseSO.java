package operation;

public class UpperCaseSO implements IStringOperation {
    @Override
    public String operate(String input) {
        return input.toUpperCase();
    }

    @Override
    public String getName() {
        return "upper_case";
    }
}
