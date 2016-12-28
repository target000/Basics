import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// test basic array usage
public class TestArray {

    public static void main(String[] args) {

        // note that if you don't specify the comparator, you will

        int[] arr = { 8, 5, 7, 1, 9 };

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        String[] strArr = { "jerry", "tom", "bob", "charlie", "zack", "alex" };

        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr);

        System.out.println(Arrays.toString(strArr));

        // this is lex sorting
        String[] strArr2 = { "11", "12", "1", "23", "45", "348", "3672" };

        Arrays.sort(strArr2);

        // print after sort
        System.out.println(Arrays.toString(strArr2));

        // reverse the array
        Collections.reverse(Arrays.asList(strArr2));

        // after the reverse hmm the original array is affected ...
        System.out.println(Arrays.toString(strArr2));

        // can't do it on primitives ..
        // convert array to list
        String[] strtest = { "1", "2", "3" };
        List<String> list2 = Arrays.asList(strtest);
        System.out.println(list2.toString());

        int[] arrint = { 8, 6, 4, 3, 1 };

    }

}
