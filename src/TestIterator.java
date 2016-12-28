import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {

        Deque<Integer> list = new ArrayDeque<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // While Loop iterator
        Iterator<Integer> iter = list.iterator();
        System.out.println("iter 1:");
        while (iter.hasNext()) {
            Integer val = (Integer) iter.next();
            System.out.println(val);
        }

        // For Loop iterator
        Iterator<Integer> iter2 = list.iterator();
        System.out.println("iter 2:");
        for (list.iterator(); iter2.hasNext();) {
            Integer ele = iter2.next();
            System.out.println(ele);
        }

    }

}
