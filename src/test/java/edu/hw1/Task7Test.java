package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @ParameterizedTest(name = "{index}: {0} with rotate right {1} corresponds to {2}")
    @DisplayName("RotateRight")
    @CsvSource({
        "8, 1, 4",})
    void testRight(int number, int shift, int expected) {
        assertThat(Task7.rotateRight(number, shift)).isEqualTo(expected);
    }

    @ParameterizedTest(name = "{index}: {0} with rotate left {1} corresponds to {2}")
    @DisplayName("RotateRight")
    @CsvSource({
        "16, 1, 1",
        "17, 2, 6",})
    void testLeft(int number, int shift, int expected) {
        assertThat(Task7.rotateLeft(number, shift)).isEqualTo(expected);
    }

}
