import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {

        Comparator<String> myComparator = new StringLengthComparator();

        // Use PQ based on the comparator
        // the comparator tells how to compare
        PriorityQueue<String> queue = new PriorityQueue<String>(10, myComparator);

        // note the order to enqueue
        queue.add("very long indeed 2");
        queue.add("medium4");
        queue.add("medium2");
        queue.add("short1");
        queue.add("very long indeed 3");
        queue.add("medium1");
        queue.add("medium3");
        queue.add("short2");
        queue.add("very long indeed 1");
        queue.add("medium6");
        queue.add("short3");
        queue.add("medium5");

        // there is no order
        Iterator<String> iter = queue.iterator();
        while (iter.hasNext()) {
            Object object = (String) iter.next();
            System.out.println(object);
        }

        System.out.println("------------");

        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }

    }
}

// basically this is the comparision criteria
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        // Assume neither string is null. Real code should
        // probably be more robust
        // You could also just return x.length() - y.length(),
        // which would be more efficient.
        if (x.length() < y.length()) {
            return -1;
        }

        if (x.length() > y.length()) {
            return 1;
        }

        return 0;
    }
}