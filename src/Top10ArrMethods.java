import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Top10ArrMethods {
    public static void main(String[] args) {

        // didn't keep ones that uses apache common lib
        
        // array -> arraylist
        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);

        // array contains a certain value
        // hmm but have to convert to arraylist first
        boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println(b);

        // arraylist -> array
        String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
        System.out.println(Arrays.toString(stringArr));

        // array -> set
        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));

        // set -> array
    }
}
