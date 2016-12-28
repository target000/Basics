
public class TestParseInt {

    public static void main(String[] args) {

        String str = "123";
        int val = Integer.valueOf(str) + 100;
        System.out.println(val);

        String str2 = "3.1415926";
        double val2 = Double.valueOf(str2) * 2;
        System.out.println(val2);

    }

}
