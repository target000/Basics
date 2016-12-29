
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 8, 9, 10, 12 };
        int target = 8;

        System.out.println(binarySearch(arr, target));

    }

    public static int binarySearch(int[] arr, int target) {
        return binSearch(arr, target, 0, arr.length - 1);
    }

    public static int binSearch(int[] arr, int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binSearch(arr, target, low, mid - 1);
        } else {
            return binSearch(arr, target, mid + 1, high);
        }

    }

}
