package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {

    @Test
    void testTake1() {
        // BEGIN

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = App.take(list, 2);
        assertThat(result).isEqualTo(Arrays.asList(1, 2));
    }

    @Test
    void testTake2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> result = App.take(list, 8);
        assertThat(result).isEqualTo(Arrays.asList(7, 3, 10));
    }
    // END
}

