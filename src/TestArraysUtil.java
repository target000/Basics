import java.util.Arrays;

public class TestArraysUtil {
    public static void main(String[] args) {

        // Sorting the array
        int[] arr = { 8, 5, 7, 1, 9 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // binarySearch and return the index
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 9));
        // -6
        System.out.println(Arrays.binarySearch(arr, 10));

        // Populate the array
        int[] arr2 = new int[10];
        Arrays.fill(arr2, 1000);
        System.out.println(Arrays.toString(arr2));

        // array comparison
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = { 1, 2, 3 };
        int[] arr5 = { 1, 2, 4 };
        System.out.println(Arrays.equals(arr3, arr4));
        System.out.println(Arrays.equals(arr3, arr5));
        
        

    }

}
