package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String characters, String word) {
        word = word.toLowerCase();
        List<Character> lettersList = new ArrayList<>();
        for (char c : characters.toCharArray()) {
            lettersList.add(c);
        }
        for (char c : word.toCharArray()) {
            if (!lettersList.contains(c)) {
                return false;
            }
            lettersList.remove(Character.valueOf(c));
        }
        return true;
    }
}
//END
