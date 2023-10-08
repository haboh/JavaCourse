package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("Sample 1")
    void sample1() {
        // given
        int number = 4666;

        // when
        int seconds = Task2.countDigits(number);

        // then
        assertThat(seconds).isEqualTo(4);
    }

    @Test
    @DisplayName("Sample 2")
    void sample2() {
        // given
        int number = 544;

        // when
        int seconds = Task2.countDigits(number);

        // then
        assertThat(seconds).isEqualTo(3);
    }

    @Test
    @DisplayName("Sample 3")
    void sample3() {
        // given
        int number = 0;

        // when
        int seconds = Task2.countDigits(number);

        // then
        assertThat(seconds).isEqualTo(1);
    }

    @Test
    @DisplayName("Negative number")
    void negativeNumber() {
        // given
        int number = -100;

        // when
        int seconds = Task2.countDigits(number);

        // then
        assertThat(seconds).isEqualTo(3);
    }

    @Test
    @DisplayName("Big positive number")
    void bigPositive() {
        // given
        int number = Integer.MAX_VALUE;

        // when
        int seconds = Task2.countDigits(number);

        // then
        assertThat(seconds).isEqualTo(10);
    }

    @Test
    @DisplayName("Big negative number")
    void bigNegative() {
        // given
        int number = Integer.MIN_VALUE;

        // when
        int seconds = Task2.countDigits(number);

        // then
        assertThat(seconds).isEqualTo(10);
    }
}
