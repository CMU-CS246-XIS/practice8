package pkg8.pkg1;

public class ArrayOperations {
    public static int fiMaxNum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng");
        }
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max; 
    }
}
