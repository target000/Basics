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

        // System class - copy to existing array
        int[] source = { 1, 2, 3, 4, 5 };
        int[] target = new int[source.length];

        System.out.println("before copy");
        System.out.println(Arrays.toString(target));
        System.arraycopy(source, 0, target, 0, source.length);
        System.out.println(Arrays.toString(target));

        // Arrays.copyOf - creates a new array
        int[] copied = Arrays.copyOf(source, source.length);
        System.out.println(Arrays.toString(copied));

    }

}
