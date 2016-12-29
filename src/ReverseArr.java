import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {

        int[] arr1 = { 1 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 8, 5, 7, 1, 9 };
        int[] arr4 = { 8, 5, 7, 0, 1, 3, 2, 0, 4 };

        reverseArr(arr4);

        System.out.println(Arrays.toString(arr4));

    }

    // O(n) time O(1) space, probably optimal
    // this method does it in-place
    public static void reverseArr(int[] arr) {

        // arr == null is front for a reason
        if (arr == null || arr.length == 0) {
            return;
        }

        int mid = arr.length / 2;

        // even elements, stop before center line
        // odd elements, stop before center element
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

    }

}
