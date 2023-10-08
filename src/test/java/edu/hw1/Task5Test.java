package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("Sample 1")
    void sample1() {
        // given
        int number = 11211230;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindrome).isTrue();
    }

    @Test
    @DisplayName("Sample 2")
    void sample2() {
        // given
        int number = 13001120;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindrome).isTrue();
    }

    @Test
    @DisplayName("Sample 3")
    void sample3() {
        // given
        int number = 23336014;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindrome).isTrue();
    }

    @Test
    @DisplayName("Sample 4")
    void sample4() {
        // given
        int number = 11;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindrome).isTrue();
    }

    @Test
    @DisplayName("Zero")
    void zero() {
        // given
        int number = 0;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindrome).isTrue();
    }

    @Test
    @DisplayName("Negative answer")
    void negative() {
        // given
        int number = 548312245;

        // when
        boolean isPalindrome = Task5.isPalindromeDescendant(number);

        // then
        assertThat(isPalindrome).isFalse();
    }
}
