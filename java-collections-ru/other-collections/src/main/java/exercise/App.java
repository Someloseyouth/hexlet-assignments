package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> dict1, Map<String, Object> dict2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        Set<String> keys1 = dict1.keySet();
        Set<String> keys2 = dict2.keySet();

        for (String key : keys1) {
            Object value1 = dict1.get(key);
            Object value2 = dict2.get(key);

            if (value1 == null && value2 != null) {
                result.put(key, "added");
            } else if (value2 == null && value1 != null) {
                result.put(key, "deleted");
            } else {
                if (value1.equals(value2)) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            }
        }

        return result;
    }
}
//END
