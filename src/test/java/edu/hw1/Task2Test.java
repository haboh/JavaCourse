package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @ParameterizedTest(name = "{index}: {0} consists of {1} digits")
    @CsvSource({
        "4666, 4",
        "544, 3",
        "0, 1",
        "-100, 3",
        "2147483647, 10",
        "-2147483648, 10"})
    void test(int number, int digits) {
        assertThat(Task2.countDigits(number)).isEqualTo(digits);
    }
}
