
public class CharTrick {
    public static void main(String[] args) {

        char myChar = 'a';

        // note the ++
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

    }

}
