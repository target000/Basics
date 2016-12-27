import java.util.Iterator;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Iterator<Integer> iter = stack.iterator();
        while (iter.hasNext()) {
            Object object = (Object) iter.next();
            System.out.println(object);
        }

        System.out.println("-----------");
        
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
