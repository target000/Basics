import java.util.Arrays;

public class CharTrick {
    public static void main(String[] args) {

        // This is a very important tirck you can utilize

        char myChar = 'a';

        // note the ++ will give you next char which is 'b'
        ++myChar;
        System.out.println(myChar);

        // char normalization
        // good way to convert char to num
        int myChar_z = 'z' - 'a';
        int myChar_a = 'a' - 'a';

        System.out.println(myChar_z);
        System.out.println(myChar_a);

        // convert num to char
        char test = 10 + 'a';
        System.out.println(test);

        // this works for digits as well

        System.out.println('0' - '0');
        System.out.println('1' - '0');
        System.out.println('9' - '0');

        // sort char array
        char[] testCharArr = { '8', '5', '7', '1', '9' };
        Arrays.sort(testCharArr);
        System.out.println(Arrays.toString(testCharArr));

    }

}
