import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrComp implements Test2 {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 1, 4, 2 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Test2 t2 = new ArrComp();

        t2.sayMyName();

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            Object object = (Object) itr.next();
            System.out.println(object);
        }

    }

    @Override
    public void sayMyName() {
        System.out.println("Heisenburg");
    }

    @Override
    public int method2() {
        return 0;
    }
}

interface Test2 {

    public void sayMyName();

    public int method2();
}
