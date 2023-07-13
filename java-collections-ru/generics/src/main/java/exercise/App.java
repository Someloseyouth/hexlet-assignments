package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where){
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> where: books) {
            boolean find = true;

            for (Entry<String, String> entry: where.entrySet()) {
                String whereValue = where.getOrDefault(entry.getKey(), "");
                if (!whereValue.equals(entry.getValue())) {
                    find = false;
                }
            }

            if (find) {
                result.add(where);
            }
        }

        return result;
    }
}
//END
