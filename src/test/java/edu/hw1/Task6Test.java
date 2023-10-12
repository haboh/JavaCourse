package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @ParameterizedTest(name = "{index}: {0} is not computable")
    @DisplayName("Negative tests")
    @ValueSource(ints = {1000, 10000})
    void positive(int number) {
        assertThat(Task6.countK(number)).isEqualTo(-1);
    }

    @ParameterizedTest(name = "{index}: {0} is not computable")
    @DisplayName("Positive tests")
    @CsvSource({
        "6621, 5",
        "6554, 4",
        "1234, 3"})
    void positive(int number, int expectedK) {
        assertThat(Task6.countK(number)).isEqualTo(expectedK);
    }
}
