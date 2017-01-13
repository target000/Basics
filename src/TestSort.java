import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {

        int[] arr = { 8, 5, 7, 1, 9 };

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

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

    }

    public static void mergeSort(int[] arr) {

    }

    public static void quickSort(int[] arr) {

    }

    public static void heapSort(int[] arr) {

    }

}
