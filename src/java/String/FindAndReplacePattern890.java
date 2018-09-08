package java.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (match(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean match(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();
        if (word.length() != pattern.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            char c1 = pattern.charAt(i);
            if (!map.containsKey(c) ) {
                map.put(c, c1);
            }
            if (!map1.containsKey(c1)) {
                map1.put(c1, c );
            }
            if (map.get(c) !=c1 || map1.get(c1) != c){
               return false;
            }
        }
        return true;
    }
}
