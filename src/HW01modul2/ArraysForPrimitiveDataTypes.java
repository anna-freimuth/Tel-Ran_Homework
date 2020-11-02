package HW01modul2;

public class ArraysForPrimitiveDataTypes {

    public static void main(String[] args) {
        int[] intArray = createRandomIntArray(3);
        printArray(intArray);
        intArray = addElementArray(2, intArray);
        printArray(intArray);
        intArray = deleteElementArray(intArray);
        printArray(intArray);
        intArray = updateElementArray(intArray, 2, 6);
        printArray(intArray);

        double[] doubleArray = createRandomDoubleArray(3);
        printArray(doubleArray);
        doubleArray = addElementArray(2, doubleArray);
        printArray(doubleArray);
        doubleArray = deleteElementArray(doubleArray);
        printArray(doubleArray);
        doubleArray = updateElementArray(doubleArray, 2, 6);
        printArray(doubleArray);
    }

    private static int[] updateElementArray(int[] intArray, int index, int update) {
        intArray[index] = update;
        return intArray;
    }

    private static int[] deleteElementArray(int[] intArray) {
        int[] newIntArray = new int[intArray.length - 1];
        for (int i = 0; i < newIntArray.length; i++) {
            newIntArray[i] = intArray[i];
        }
        return newIntArray;
    }

    public static int[] addElementArray(int newElement, int[] intArray) {
        int[] newIntArray = new int[intArray.length + 1];
        for (int i = 0; i < intArray.length; i++) {
            newIntArray[i] = intArray[i];
        }
        newIntArray[newIntArray.length - 1] = newElement;
        return newIntArray;
    }

    public static int[] createRandomIntArray(int size) {

        int[] newIntArray = new int[size];
        for (int i = 0; i < size; i++) {
            newIntArray[i] = (int) (Math.random() * 1000);
        }
        return newIntArray;
    }

    public static void printArray(int[] arrayForInt) {
        System.out.print("Int array:  [");
        for (int i = 0; i < arrayForInt.length - 1; i++) {
            System.out.print(arrayForInt[i] + ", ");
        }
        System.out.print(arrayForInt[arrayForInt.length - 1] + "]");
        System.out.println();
    }

    private static double[] updateElementArray(double[] doubleArray, int index, double update) {
        doubleArray[index] = update;
        return doubleArray;
    }

    private static double[] deleteElementArray(double[] doubleArray) {
        double[] newDoubleArray = new double[doubleArray.length - 1];
        for (int i = 0; i < newDoubleArray.length; i++) {
            newDoubleArray[i] = doubleArray[i];
        }
        return newDoubleArray;
    }

    public static double[] addElementArray(double newElement, double[] doubleArray) {
        double[] newDoubleArray = new double[doubleArray.length + 1];
        for (int i = 0; i < doubleArray.length; i++) {
            newDoubleArray[i] = doubleArray[i];
        }
        newDoubleArray[newDoubleArray.length - 1] = newElement;
        return newDoubleArray;
    }

    public static double[] createRandomDoubleArray(int size) {

        double[] newDoubleArray = new double[size];
        for (int i = 0; i < size; i++) {
            newDoubleArray[i] = (double) (Math.random() * 1000);
        }
        return newDoubleArray;
    }

    public static void printArray(double[] arrayForDouble) {
        System.out.print("double array:  [");
        for (int i = 0; i < arrayForDouble.length - 1; i++) {
            System.out.print(arrayForDouble[i] + ", ");
        }
        System.out.print(arrayForDouble[arrayForDouble.length - 1] + "]");
        System.out.println();
    }
}
