package HW23;

public class Task06 {
    public static void main(String[] args) {
        int[]a1 = new int[]{1,2,3};
        int[]a2 = new int[]{7,9,8};
        //front11([1, 2, 3], [7, 9, 8]) → [1, 7]
        int[]b1 = new int[]{1};
        int[]b2 = new int[]{2};
        //front11([1], [2]) → [1, 2]
        int[]c1 = new int[]{1,7};
        int[]c2 = new int[]{};
        //front11([1, 7], []) → [1]
        FillAndPrintIntArrayEdition.myPrintIntArray(front11(a1,a2));
        FillAndPrintIntArrayEdition.myPrintIntArray(front11(b1,b2));
        FillAndPrintIntArrayEdition.myPrintIntArray(front11(c1,c2));
        FillAndPrintIntArrayEdition.myPrintIntArray(front11(c2,c2));
    }
    private static int[] front11(int[]array1, int[]array2){
        if(array1.length == 0 && array2.length == 0){
            int[]output3 = new int[0];
            return output3;
        }
        if(array1.length == 0){
            int[]output2 = new int[1];
            output2[0]= array2[0];
            return output2;
        }
        if(array2.length == 0) {
            int[]output1 = new int[1];
            output1[0]= array1[0];
            return output1;
        }
            int[]output = new int[2];
            output[0]=array1[0];
            output[1]=array2[0];
            return output;
       }
    }


