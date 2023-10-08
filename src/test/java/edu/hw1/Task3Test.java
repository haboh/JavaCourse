package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    @Test
    @DisplayName("Sample 1")
    void sample1() {
        // given
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {0, 6};

        // when
        boolean can_put = Task3.countDigits(a1, a2);

        // then
        assertThat(can_put).isTrue();
    }

    @Test
    @DisplayName("Sample 2")
    void sample2() {
        // given
        int[] a1 = {3, 1};
        int[] a2 = {4, 0};

        // when
        boolean can_put = Task3.countDigits(a1, a2);

        // then
        assertThat(can_put).isTrue();
    }

    @Test
    @DisplayName("Sample 3")
    void sample3() {
        // given
        int[] a1 = {9, 9, 8};
        int[] a2 = {8, 9};

        // when
        boolean can_put = Task3.countDigits(a1, a2);

        // then
        assertThat(can_put).isFalse();
    }

    @Test
    @DisplayName("Sample 4")
    void sample4() {
        // given
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {2, 3};

        // when
        boolean can_put = Task3.countDigits(a1, a2);

        // then
        assertThat(can_put).isFalse();
    }

    @Test
    @DisplayName("Empty first")
    void emptyFirst() {
        // given
        int[] a1 = {};
        int[] a2 = {2, 3};

        // when
        boolean can_put = Task3.countDigits(a1, a2);

        // then
        assertThat(can_put).isFalse();
    }

    @Test
    @DisplayName("Empty second")
    void emptySecond() {
        // given
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {};

        // when
        boolean can_put = Task3.countDigits(a1, a2);

        // then
        assertThat(can_put).isTrue();
    }
}
