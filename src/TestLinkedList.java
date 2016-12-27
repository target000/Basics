import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println("size of linkedlist = " + ll.size());

        Iterator<Integer> iter = ll.iterator();

        while (iter.hasNext()) {
            Integer integer = (Integer) iter.next();
            System.out.println(integer);
        }

        System.out.println("first = " + ll.getFirst());

        System.out.println("thrid = " + ll.get(2));

        System.out.println("last = " + ll.getLast());

        // insert first
        ll.addFirst(0);
        System.out.println("now first = " + ll.get(0));

        // append last
        ll.addLast(100);
        System.out.println("now last = " + ll.getLast());

    }
}
