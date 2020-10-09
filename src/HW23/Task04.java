package HW23;
public class Task04 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4};
        //swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
        int[] arr2 = new int[]{1, 2, 3};
        //swapEnds([1, 2, 3]) → [3, 2, 1]
        int[] arr3 = new int[]{8, 6, 7, 9, 5};
        //swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

        FillAndPrintIntArrayEdition.myPrintIntArray(swapEnds(arr1));
        FillAndPrintIntArrayEdition.myPrintIntArray(swapEnds(arr2));
        FillAndPrintIntArrayEdition.myPrintIntArray(swapEnds(arr3));
    }

    private static int[] swapEnds(int[] array) {
        int[] output = new int[array.length];
        for (int i = 1; i < output.length; i++) {
            output[0] = array[array.length - 1];
            output[i] = array[i];
            output[output.length - 1] = array[0];
        }
        return output;
    }
}

