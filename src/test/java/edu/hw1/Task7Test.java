package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    @Test
    @DisplayName("Sample 1")
    void sample1() {
        // given
        int number = 8;
        int shift = 1;

        // when
        int result = Task7.rotateRight(number, shift);

        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("Sample 2")
    void sample2() {
        // given
        int number = 16;
        int shift = 1;

        // when
        int result = Task7.rotateLeft(number, shift);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("Sample 3")
    void sample3() {
        // given
        int number = 17;
        int shift = 2;

        // when
        int result = Task7.rotateLeft(number, shift);

        // then
        assertThat(result).isEqualTo(6);
    }
}
