import java.util.Arrays;

public class MyHeap {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap();
        heap.add(8);
        heap.add(5);
        heap.add(7);
        heap.add(1);
        heap.add(9);
        heap.add(6);
        heap.add(4);
        heap.add(3);

        heap.showAll();

        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());

        heap.showAll();
        System.out.println(heap.last);
        System.out.println("sz= " + heap.size());
    }

    int capacity = 4;
    int last = 0;
    int[] arr = new int[capacity];

    public MyHeap() {
        arr[0] = Integer.MAX_VALUE;
    }

    public void showAll() {
        System.out.println(Arrays.toString(arr));
    }

    public int size() {
        return last;
    }

    public void add(int val) {
        if (last >= capacity - 1) {
            capacity *= 2;
            arr = Arrays.copyOf(arr, capacity);
        }

        last++;
        arr[last] = val;
        bubbleUp(last);
    }

    public Integer poll() {
        int val = arr[1];
        if (last == 1) {

            arr[last] = 0;
            last--;
            return val;
        }

        arr[1] = arr[last];
        arr[last] = 0;

        last--;
        bubbleUp(last);

        return val;
    }

    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bubbleUp(int last) {

        int i = last;

        while (i != 1) {
            if (i % 2 == 0) {
                if (arr[i] < arr[i / 2]) {
                    swap(i, i / 2);
                }
            } else {
                if (arr[i] < arr[i - 1]) {
                    if (arr[i] < arr[i / 2]) {
                        swap(i, i / 2);
                    }
                } else {
                    if (arr[i - 1] < arr[i / 2]) {
                        swap(i - 1, i / 2);
                    }
                }
            }
            i /= 2;
        }
    }

}
