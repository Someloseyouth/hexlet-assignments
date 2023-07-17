package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.Stream;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        return (int) emails.stream()
                .filter(email -> email.contains("gmail.com") || email.contains("yandex.ru") || email.contains("hotmail.com"))
                .count();
    }
}
// END
