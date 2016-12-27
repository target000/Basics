import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("hello", 1);
        map.put("hello", 1);
        map.put("hello", 10);
        // last set to 2
        map.put("hello", 2);
        map.put("good key", 123);
        map.put("just another key", -1);
        map.put("this should not show up", -1);

        map.remove("this should not show up");
        
        int value = map.get("hello");
        System.out.println(value);
        
        // note
        System.out.println(map.entrySet());

        // best way to iterate thru a hashmap
        Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            // Entry<String, Integer> entry = (Entry<String, Integer>) iter.next();
            // System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
