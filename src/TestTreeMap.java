import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

    }
}
