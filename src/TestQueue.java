import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        Iterator<Integer> iter = q.iterator();

        while (iter.hasNext()) {
            Integer integer = (Integer) iter.next();
            System.out.println(integer);
        }

        System.out.println("------");

        System.out.println("original size = " + q.size());

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        System.out.println("after dequeue size = " + q.size());

    }
}
