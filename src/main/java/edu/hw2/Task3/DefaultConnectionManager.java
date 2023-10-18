package edu.hw2.Task3;

import java.util.Random;

public class DefaultConnectionManager implements ConnectionManager {
    private final Random random;
    private final static double FAULTY_CONNECTION_PROBABILITY = 0.3;

    DefaultConnectionManager() {
        random = new Random();
    }

    @Override
    public Connection getConnection() {
        if (random.nextDouble() < FAULTY_CONNECTION_PROBABILITY) {
            return new FaultyConnection();
        } else {
            return new StableConnection();
        }
    }
}
