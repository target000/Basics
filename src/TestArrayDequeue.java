import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.SynchronousQueue;

// With regard to why ArrayDeque is a better option, best pratice kinda shit
// Please fking read 'em and digest 'em mate

// http://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist
// http://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack
// https://docs.oracle.com/javase/7/docs/api/java/util/ArrayDeque.html

// The only better operation of a linked list is removing the current element during iteration.

public class TestArrayDequeue {
    public static void main(String[] args) {

        // note that name changing is irrelevant, it is done only for clearity

        // use it as stack
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack: add 1,2,3,4,5");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("-------------------");

        // use it as queue
        Deque<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue: add 1,2,3,4,5");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("-------------------");

        // use it as LinkedList
        Deque<Integer> linkedlist = new ArrayDeque<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);

        linkedlist.remove(1);
        linkedlist.remove(3);

        System.out.println("LinkedList: add 1,2,3,4,5 remove 1 3");

        System.out.println(linkedlist.toString());

    }
}
