package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("Sample 1")
    void sample1() {
        // given

        // when
        int seconds = Task2.minutesToSeconds("01:00");

        // then
        assertThat(seconds).isEqualTo(60);
    }

    @Test
    @DisplayName("Sample 2")
    void sample3() {
        // given

        // when
        int seconds = Task2.minutesToSeconds("13:56");

        // then
        assertThat(seconds).isEqualTo(836);
    }

    @Test
    @DisplayName("Sample 3")
    void sample2() {
        // given

        // when
        int seconds = Task2.minutesToSeconds("10:60");

        // then
        assertThat(seconds).isEqualTo(-1);
    }

    @Test
    @DisplayName("Big seconds")
    void tooBigSeconds() {
        // given

        // when
        int seconds = Task2.minutesToSeconds("10:400");

        // then
        assertThat(seconds).isEqualTo(-1);
    }

    @Test
    @DisplayName("Big minutes")
    void tooBigMinutes() {
        // given

        // when
        int seconds = Task2.minutesToSeconds("100:35");

        // then
        assertThat(seconds).isEqualTo(6035);
    }

    @Test
    @DisplayName("Not enough symbols in seconds")
    void fewSeconds() {
        // given

        // when
        int seconds = Task2.minutesToSeconds("100:3");

        // then
        assertThat(seconds).isEqualTo(-1);
    }
}
