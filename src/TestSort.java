import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {

        int[] arr = { 8, 75, -7, 91, 69, 31, 64, -28, 0, 56, -12, 5, 100, 9, 11, 84, 28, 4, -1 };

        mergeSort(arr);
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

    // like the reverse of bubble sort, compare two elements side by side going from i back to 0
    // use arr[j-1] > arr[j] swap order otherwise bail out
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
        int[] tempArr = new int[arr.length];
        mergesortHelper(arr, 0, arr.length - 1, tempArr);
    }

    private static void mergesortHelper(int[] arr, int low, int high, int[] tmpArr) {

        if (low < high) {
            int mid = (low + high) / 2;
            mergesortHelper(arr, low, mid, tmpArr);
            mergesortHelper(arr, mid + 1, high, tmpArr);
            mergeParts(arr, low, mid, high, tmpArr);
        }
    }

    // key function
    // very interesting observation
    // if [0 mid-1] [mid high] is used will result in index not updating
    // use [0 mid] [mid+1 high]
    private static void mergeParts(int[] arr, int low, int mid, int high, int[] tmpArr) {

        int i = low;
        int j = mid + 1;
        int k = low;

        for (int x = low; x <= high; x++) {
            tmpArr[x] = arr[x];
        }

        while (i <= mid && j <= high) {
            if (tmpArr[i] < tmpArr[j]) {
                arr[k++] = tmpArr[i++];
            } else {
                arr[k++] = tmpArr[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = tmpArr[i++];
        }

        while (j <= high) {
            arr[k++] = tmpArr[j++];
        }

    }

    public static void quickSort(int[] arr) {

    }

    public static void heapSort(int[] arr) {

    }

}
