package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @ParameterizedTest(name = "{index}: {0} is palindrome descendant")
    @DisplayName("Positive tests")
    @ValueSource(ints = { 11211230, 13001120, 23336014, 11, 0 })
    void positive(int number) {
        assertThat(Task5.isPalindromeDescendant(number)).isTrue();
    }

    @ParameterizedTest(name = "{index}: {0} is not palindrome descendant")
    @DisplayName("Negative tests")
    @ValueSource(ints = { 548312245 })
    void negative(int number) {
        assertThat(Task5.isPalindromeDescendant(number)).isFalse();
    }
}
