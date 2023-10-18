package edu.hw2.Task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {
    @Test
    @DisplayName("Inplace call")
    public void inplaceCall() {
        assertThat(Task4.callingInfo()).isEqualTo(new CallingInfo(this.getClass().getTypeName(), "inplaceCall"));
    }

    private static class TestCall {
        public CallingInfo test() {
            return Task4.callingInfo();
        }

        public CallingInfo innerCall() {
            return test();
        }
    }

    @Test
    @DisplayName("Inner call")
    void innerCall() {
        TestCall test = new TestCall();
        assertThat(test.test()).isEqualTo(new CallingInfo(TestCall.class.getTypeName(), "test"));
        assertThat(test.innerCall()).isEqualTo(new CallingInfo(TestCall.class.getTypeName(), "test"));
    }
}
