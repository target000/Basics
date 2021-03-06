import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("tom");
        set.add("jerry");
        set.add("Tom");
        set.add("cat");
        set.add("dog");
        set.add("dog");
        set.add("dog");

        System.out.println(set.toString());

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String string = (String) iter.next();
            System.out.println(string);
        }

        System.out.println("size of the set = " + set.size());

        set.remove("dog");

        System.out.println(set.toString());

        System.out.println(set.remove("1"));

        System.out.println(set.toString());

        System.out.println(set.add("fking A!"));
        System.out.println(set.add("fking A!"));
        System.out.println(set.add("fking A!"));

        System.out.println(set.remove("fking A!"));
        System.out.println(set.remove("fking A!"));

    }
}
