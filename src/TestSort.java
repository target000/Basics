import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {

        int[] arr = { 8, 75, -7, 91, 69, 31, 64, -28, 0, 56, -12, 5, 100, 9, 11, 84, 28, 4, -1 };

        insertionSort(arr);
        System.out.println(isSorted(arr));

        System.out.println(Arrays.toString(arr));

    }

    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void selectionSort(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }

        int min;
        int minIndex;

        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    // when things get confusing, use <= instead of <
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    public static void mergeSort(int[] arr) {

    }

    public static void quickSort(int[] arr) {

    }

    public static void heapSort(int[] arr) {

    }

}
