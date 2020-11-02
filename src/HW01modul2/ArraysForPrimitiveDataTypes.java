package HW01modul2;

public class ArraysForPrimitiveDataTypes {

    public static void main(String[] args) {
//Create methods for arrays[] with primitive dataTypes:
//int, double, byte, char, long
//print, create, add element, delete element, update element
//use overloading
        int[] intArray = createRandomIntArray(3);
        printArray(intArray);
        intArray = addElementArray(2,intArray);
        printArray(intArray);
        intArray = deleteElementArray(intArray);
        printArray(intArray);
        intArray = updateElementArray(intArray, 2, 6);
        printArray(intArray);

        double[] doubleArray = createRandomdoubleArray(3);
        printArray(doubleArray);
        doubleArray = addElementArray(2,doubleArray);
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
        int[] newIntArray = new int[intArray.length-1];
        for (int i = 0; i < newIntArray.length; i++) {
            newIntArray[i] = intArray[i];
        }
        return newIntArray;
    }

    public static int[] addElementArray(int newElement, int[] intArray){
        int[] newIntArray = new int[intArray.length+1];
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
        double[] newdoubleArray = new double[doubleArray.length-1];
        for (int i = 0; i < newdoubleArray.length; i++) {
            newdoubleArray[i] = doubleArray[i];
        }
        return newdoubleArray;
    }

    public static double[] addElementArray(double newElement, double[] doubleArray){
        double[] newdoubleArray = new double[doubleArray.length+1];
        for (int i = 0; i < doubleArray.length; i++) {
            newdoubleArray[i] = doubleArray[i];
        }
        newdoubleArray[newdoubleArray.length - 1] = newElement;
        return newdoubleArray;
    }

    public static double[] createRandomdoubleArray(int size) {

        double[] newdoubleArray = new double[size];
        for (int i = 0; i < size; i++) {
            newdoubleArray[i] = (double) (Math.random() * 1000);
        }
        return newdoubleArray;
    }

    public static void printArray(double[] arrayFordouble) {
        System.out.print("double array:  [");
        for (int i = 0; i < arrayFordouble.length - 1; i++) {
            System.out.print(arrayFordouble[i] + ", ");
        }
        System.out.print(arrayFordouble[arrayFordouble.length - 1] + "]");
        System.out.println();
    }
}
