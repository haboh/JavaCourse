package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Sample 1")
    void sample1() {
        // given
        String time = "01:00";

        // when
        int seconds = Task1.minutesToSeconds(time);

        // then
        assertThat(seconds).isEqualTo(60);
    }

    @Test
    @DisplayName("Sample 2")
    void sample2() {
        // given
        String time = "13:56";

        // when
        int seconds = Task1.minutesToSeconds(time);

        // then
        assertThat(seconds).isEqualTo(836);
    }

    @Test
    @DisplayName("Sample 3")
    void sample3() {
        // given
        String time = "10:60";

        // when
        int seconds = Task1.minutesToSeconds(time);

        // then
        assertThat(seconds).isEqualTo(-1);
    }

    @Test
    @DisplayName("Big seconds")
    void tooBigSeconds() {
        // given
        String time = "10:400";

        // when
        int seconds = Task1.minutesToSeconds(time);

        // then
        assertThat(seconds).isEqualTo(-1);
    }

    @Test
    @DisplayName("Big minutes")
    void tooBigMinutes() {
        // given
        String time = "100:35";

        // when
        int seconds = Task1.minutesToSeconds(time);

        // then
        assertThat(seconds).isEqualTo(6035);
    }

    @Test
    @DisplayName("Not enough symbols in seconds")
    void fewSeconds() {
        // given
        String time = "100:3";

        // when
        int seconds = Task1.minutesToSeconds(time);

        // then
        assertThat(seconds).isEqualTo(-1);
    }
}
