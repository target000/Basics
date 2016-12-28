import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("tom");
        list.add("Jerry");
        list.add("Tom");
        list.add("Cat");
        list.add("Amy");
        list.add("Bob");
        list.add("Tbag");

        Iterator<String> iter1 = list.iterator();
        while (iter1.hasNext()) {
            String string = (String) iter1.next();
            System.out.println(string);
        }

        System.out.println("-------");
        Collections.sort(list);

        Iterator<String> iter2 = list.iterator();
        while (iter2.hasNext()) {
            String string = (String) iter2.next();
            System.out.println(string);
        }

        System.out.println("****");

        // syntax to convert the list to array
        String[] test = list.toArray(new String[list.size()]);
        for (int i = 0; i < test.length; i++) {
            // System.out.println(test[i]);
        }

        // remove element from list
        System.out.println(list.toString());

        list.remove("Tbag");

        System.out.println(list.toString());

        List<Integer> listNumber = new ArrayList<Integer>();
        listNumber.add(8);
        listNumber.add(5);
        listNumber.add(7);
        listNumber.add(1);
        listNumber.add(9);
        System.out.println(listNumber.toString());
        
        Collections.sort(listNumber);
        System.out.println(listNumber.toString());
        
        

    }
}
