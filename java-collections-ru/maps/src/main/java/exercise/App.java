package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> dictionaryMap = new HashMap<>();
        if (sentence.length() == 0) {
            return dictionaryMap;
        }
        String[] arr = sentence.split(" ");
        for (String s : arr) {
            dictionaryMap.put(s, dictionaryMap.getOrDefault(s, 0) + 1);
        }
        return dictionaryMap;
    }

    public static String toString(Map<String, Integer> dictionary) {
        String output = null;
        if (dictionary.isEmpty()) {
            output = "{}";
        } else {
            output = ("{" + '\n');
            for (String key : dictionary.keySet()) {
                output += ("  " + key + ": " + dictionary.get(key) + '\n');
            }
            output += "}";
        }
        return output;
    }
}
//END
