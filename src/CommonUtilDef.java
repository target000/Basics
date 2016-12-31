import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class CommonUtilDef {
    public static void main(String[] args) {
        // Best way to define pq
        Queue<Integer> pq = new PriorityQueue<Integer>();
        // unless there is a lot insertion and deletions, use ArrayDeque instead
        Queue<Integer> q = new LinkedList<Integer>();

        // use ArrayDeque instead of stack and queue as per Jon Skeet
        Deque<Integer> stack = new ArrayDeque<Integer>();
        Deque<Integer> queue = new ArrayDeque<Integer>();

        // this defines a doubly linked list
        List<Integer> ll = new LinkedList<Integer>();
        List<Integer> al = new ArrayList<Integer>();

        // Map
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        // Set
        Set<String> set = new HashSet<String>();
    }
}
