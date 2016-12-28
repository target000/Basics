import java.util.Arrays;
import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String[] args) {

        String str = "   this is a fun   string that I will    use to test string tokenizer           wow            ";
        StringTokenizer st = new StringTokenizer(str);

        String mathExp = " 1 + 2 * 3 =";
        StringTokenizer st2 = new StringTokenizer(mathExp);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }

        System.out.println("--------");

        System.out.println("number of toekns = " + st2.countTokens());

        String str2 = st2.nextElement().toString();
        System.out.println("first token" + str2);

        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextElement().toString());
        }

        // PREFERED
        // split is better in a way that it tokenizes to array
        str = str.trim();
        String[] strArr = str.split("\\s+");
        System.out.println(Arrays.toString(strArr));

    }
}
