package chaptor11.comm;

import java.util.HashMap;
import java.util.Map;

//Java版WorldCount
public class Code04_WordCount {
    public static void main(String[] args) {

        String sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = sentence.toCharArray();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
