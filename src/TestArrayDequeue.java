import java.util.ArrayDeque;
import java.util.Deque;

// With regard to why ArrayDeque is a better option

// http://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist
// http://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack
// https://docs.oracle.com/javase/7/docs/api/java/util/ArrayDeque.html

// The only better operation of a linked list is removing the current element during iteration.

public class TestArrayDequeue {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
