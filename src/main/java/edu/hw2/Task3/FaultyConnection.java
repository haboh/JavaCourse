package edu.hw2.Task3;

import java.util.Random;

public class FaultyConnection implements Connection {
    private final Random random;

    FaultyConnection() {
        random = new Random();
    }

    @Override
    public void execute(String command) throws ConnectionException {
        if (random.nextBoolean()) {
            throw new ConnectionException("Execution aborted", null);
        }
    }

    @Override
    public void close() throws Exception {

    }
}
