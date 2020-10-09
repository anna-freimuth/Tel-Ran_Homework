package HW23;

public class Task05 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        //frontPiece([1, 2, 3]) → [1, 2]
        int[] arr2 = new int[]{1, 2};
        //frontPiece([1, 2]) → [1, 2]
        int[] arr3 = new int[]{1};
        //frontPiece([1]) → [1]
        int[] arr4 = new int[]{};
        FillAndPrintIntArrayEdition.myPrintIntArray(frontPiece(arr1));
        FillAndPrintIntArrayEdition.myPrintIntArray(frontPiece(arr2));
        FillAndPrintIntArrayEdition.myPrintIntArray(frontPiece(arr3));
        FillAndPrintIntArrayEdition.myPrintIntArray(frontPiece(arr4));

    }

    private static int[] frontPiece(int[] array) {
        if (array.length == 0 || array.length == 1) return array;
        int[] output = new int[2];
        output[0] = array[0];
        output[1] = array[1];
        return output;
    }
}

