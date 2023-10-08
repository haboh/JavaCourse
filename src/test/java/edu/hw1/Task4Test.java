package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Sample 1")
    void sample1() {
        // given
        String s = "123456";

        // when
        String fixedString = Task4.fixString(s);

        // then
        assertThat(fixedString).isEqualTo("214365");
    }

    @Test
    @DisplayName("Sample 2")
    void sample2() {
        // given
        String s = "hTsii  s aimex dpus rtni.g";

        // when
        String fixedString = Task4.fixString(s);

        // then
        assertThat(fixedString).isEqualTo("This is a mixed up string.");
    }

    @Test
    @DisplayName("Sample 3")
    void sample3() {
        // given
        String s = "badce";

        // when
        String fixedString = Task4.fixString(s);

        // then
        assertThat(fixedString).isEqualTo("abcde");
    }

    @Test
    @DisplayName("Empty string")
    void emptyString() {
        // given
        String s = "";

        // when
        String fixedString = Task4.fixString(s);

        // then
        assertThat(fixedString).isEqualTo("");
    }
}
