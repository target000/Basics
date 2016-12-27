
public class TestStringManipulations {

    public static void main(String[] args) {

        // list out all common string operations

        String str = "   this is a test string    ";

        System.out.println(str.contains("thi"));

        // remove leading and trailing spaces
        System.out.println(str.trim());

        System.out.println(str.replace(" ", "*"));

        System.out.println(str.replaceAll("\\s+", ""));

        String str2 = "www.ultra.exe";

        System.out.println(str2.endsWith(".exe"));

        System.out.println(str2.startsWith("www"));

        String str3 = "Mary had a little lamb!";

        // 0 based
        // 0 = starting index, 4 means length
        System.out.println(str3.substring(0, 4));

        System.out.println(str3.substring(1));

        String str4 = "a";
        System.out.println(str4.length());
        String str5 = "ab";
        System.out.println(str5.length());

        String str6 = "dsfsf";
        String str7 = "dsfsf";
        System.out.println(str6.equals(new String(str6)));
        System.out.println(str6.equals(new String(str5)));
        System.out.println(str6.equals(str7));

        String str8 = "needle";
        String str9 = "***needle in the haystack needle";
        System.out.println(str9.indexOf(str8));
        System.out.println(str9.lastIndexOf(str8));

        // empty
        System.out.println("".isEmpty());

        String str10 = "i want to scan thru";
        for (int i = 0; i < str10.length(); i++) {
            System.out.println(str10.charAt(i));
        }

        // split a string into a string array
        String[] strArr = str10.split("\\s+");
        for (String string : strArr) {
            System.out.println(string);
        }

    }
}
