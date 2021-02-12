package operation;

public class UpperCaseSO implements IStringOperation {
     String name;
     Integer num ;

    public UpperCaseSO() {
    }
    public UpperCaseSO(String name,Integer num) {
        this.name = name;
        this.num = num;
    }
    @Override
    public String toString() {
        return "UpperCaseSO{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }


    @Override
    public String operate(String input) {
        return input.toUpperCase();
    }

    @Override
    public String getName() {
        return "upper_case";
    }
}
