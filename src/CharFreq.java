import java.util.HashMap;
import java.util.Map;

public class CharFreq {

    // Generate freq table
    public static void main(String[] args) {

        String test1 = "aaabbccc";
        String test2 = "a";
        String test3 = "alex";
        String test4 = "this is    awesome    man ";

        Map<Character, Integer> map = freqTableFromSentence(test4);
        System.out.println(map.entrySet());

    }

    public static Map<Character, Integer> generateFreqTable(String word) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        word = word.trim();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        return map;
    }

    public static Map<Character, Integer> freqTableFromSentence(String sentence) {

        sentence = sentence.replaceAll("\\s+", "");

        return generateFreqTable(sentence);
    }

}
