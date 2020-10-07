package HW21;

public class HW21 {
    public static void main(String[] args) {
        String[] germanCites = new String[]{"Berlin", "Hamburg", "Essen"};
        printToString(germanCites);
        printToString(new String[0]);
    }

    private static void printToString(String[] nameOfArray) {
        System.out.print("[");
        String lastElement = nameOfArray.length > 0 ? nameOfArray[nameOfArray.length - 1] : "";
        for (String element : nameOfArray) {
            if (!lastElement.equals(element)) System.out.print(element + ", ");
            else System.out.print(element);
        }
        System.out.println("]");
    }
}

