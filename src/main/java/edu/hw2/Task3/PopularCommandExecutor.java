package edu.hw2.Task3;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    PopularCommandExecutor(ConnectionManager manager0, int maxAttempts0) {
        manager = manager0;
        maxAttempts = maxAttempts0;
    }

    void tryExecute(String command) throws ConnectionException {
        Exception lastException = null;
        for (int i = 0; i < maxAttempts; i++) {
            try (Connection connection = manager.getConnection()) {
                connection.execute(command);
                return;
            } catch (Exception exception) {
                lastException = exception;
            }
        }
        throw new ConnectionException("", lastException);
    }
}
