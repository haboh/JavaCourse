package edu.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @ParameterizedTest(name = "{index}: {0} is time")
    @CsvSource({
        "01:00, 60",
        "13:56, 836",
        "100:35, 6035"})
    void positiveTest(String time, int seconds) {
        assertThat(Task1.minutesToSeconds(time)).isEqualTo(seconds);
    }

    @ParameterizedTest(name = "{index} - {0} is not time")
    @ValueSource(strings = {"10:60", "10:400", "100:3", "", "aaa"})
    @NullSource
    void negativeTest(String time) {
        System.out.println(time);
        assertThat(Task1.minutesToSeconds(time)).isEqualTo(-1);
    }
}
