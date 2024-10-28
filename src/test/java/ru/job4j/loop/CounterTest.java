package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumFrom0To7Then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFrom8To0Then0() {
        int start = 8;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
