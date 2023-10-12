package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @ParameterizedTest(name = "{index}: {0} maps to {1}")
    @CsvSource({
        "123456, 214365",
        "hTsii  s aimex dpus rtni.g, This is a mixed up string.",
        "badce, abcde"})
    void test(String given, String expected) {
        assertThat(Task4.fixString(given)).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Empty and null string")
    @NullAndEmptySource
    void emptyAndNullString(String s) {
        assertThat(Task4.fixString(s)).isEqualTo(s);
    }
}
