import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {

        Comparator<String> myComparator = new StringLengthComparator();

        // Use PQ based on the comparator
        // the comparators specify how to compare
        PriorityQueue<String> pq = new PriorityQueue<String>(10, myComparator);

        // note the order to enqueue
        pq.add("very long indeed 2");
        pq.add("medium4");
        pq.add("medium2");
        pq.add("short1");
        pq.add("very long indeed 3");
        pq.add("medium1");
        pq.add("medium3");
        pq.add("short2");
        pq.add("very long indeed 1");
        pq.add("medium6");
        pq.add("short3");
        pq.add("medium5");

        // no order during iteration, this only checks what is in the pq
        Iterator<String> iter = pq.iterator();
        while (iter.hasNext()) {
            Object object = (String) iter.next();
            System.out.println(object);
        }

        System.out.println("------------");

        // order in dequeue
        while (pq.size() != 0) {
            System.out.println(pq.remove());
        }

    }
}

// define comparison criteria
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {

        if (x.length() < y.length()) {
            return -1;
        }

        if (x.length() > y.length()) {
            return 1;
        }

        return 0;
    }
}