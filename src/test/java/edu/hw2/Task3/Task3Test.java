package edu.hw2.Task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {
    private static final int CONFIDENCE_ATTEMPTS = 60;

    @Test
    @DisplayName("Stable connection test")
    void stableConnectionTest() {
        try (Connection stable = new StableConnection()) {
            for (int i = 0; i < CONFIDENCE_ATTEMPTS; i++) {
                assertDoesNotThrow(() -> stable.execute("none"));
            }
        } catch (Exception ignored) {
            fail();
        }
    }

    @Test
    @DisplayName("Unstable connection test")
    void unstableConnectionTest() {
        try (Connection unstable = new FaultyConnection()) {
            for (int i = 0; i < CONFIDENCE_ATTEMPTS; i++) {
                unstable.execute("none");
            }
        }
        catch (ConnectionException ignored) {
        }
        catch (Exception ignored) {
            fail();
        }
    }

    @Test
    @DisplayName("Faulty connection manager test")
    void faultyConnectionManagerTest() {
        ConnectionManager faulty = new FaultyConnectionManager();
        for (int i = 0; i < CONFIDENCE_ATTEMPTS; i++) {
            assertThat(faulty.getConnection()).isInstanceOf(FaultyConnection.class);
        }
    }

    @Test
    @DisplayName("Default connection manager test")
    void defaultConnectionManagerTest() {
        boolean wasFault = false;
        boolean wasStable = false;
        ConnectionManager defaultManager = new DefaultConnectionManager();
        for (int i = 0; i < CONFIDENCE_ATTEMPTS; i++) {
            if (defaultManager.getConnection().getClass() == FaultyConnection.class) {
                wasFault = true;
            }
            if (defaultManager.getConnection().getClass() == StableConnection.class) {
                wasStable = true;
            }
        }
        assertThat(wasFault && wasStable).isTrue();
    }

    @Test
    @DisplayName("Test executor with faulty manager")
    void executorWithFaultyTest() {
        ConnectionManager faultyManager = new FaultyConnectionManager();
        PopularCommandExecutor executor = new PopularCommandExecutor(faultyManager, 1);

        assertThrows(ConnectionException.class, () -> {
            executor.tryExecute("none");
            executor.tryExecute("none");
        });
    }

    @Test
    @DisplayName("Test executor with stable manager")
    void executorWithStableTest() {
        ConnectionManager stableManager = new DefaultConnectionManager();
        PopularCommandExecutor executor = new PopularCommandExecutor(stableManager, 10);

        assertDoesNotThrow(() -> {
            executor.tryExecute("none");
            executor.tryExecute("none");
        });
    }
}
