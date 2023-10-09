package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("Sample 1")
    void sample1() {
        // given
        int number = 6621;

        // when
        int steps = Task6.countK(number);

        // then
        assertThat(steps).isEqualTo(5);
    }

    @Test
    @DisplayName("Sample 2")
    void sample2() {
        // given
        int number = 6554;

        // when
        int steps = Task6.countK(number);

        // then
        assertThat(steps).isEqualTo(4);
    }

    @Test
    @DisplayName("Sample 3")
    void sample3() {
        // given
        int number = 1234;

        // when
        int steps = Task6.countK(number);

        // then
        assertThat(steps).isEqualTo(3);
    }

    @Test
    @DisplayName("Out of min bound")
    void minBound() {
        // given
        int number = 1000;

        // when
        int steps = Task6.countK(number);

        // then
        assertThat(steps).isEqualTo(-1);
    }

    @Test
    @DisplayName("Out of max bound")
    void maxBound() {
        // given
        int number = 10000;

        // when
        int steps = Task6.countK(number);

        // then
        assertThat(steps).isEqualTo(-1);
    }
}
