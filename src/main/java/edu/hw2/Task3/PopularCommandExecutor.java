package edu.hw2.Task3;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    PopularCommandExecutor(ConnectionManager manager0, int maxAttempts0) {
        manager = manager0;
        maxAttempts = maxAttempts0;
    }

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) throws ConnectionException {
        try (Connection connection = manager.getConnection()) {
            for (int i = 0; i < maxAttempts; i++) {
                connection.execute(command);
            }
        } catch (Exception e) {
            throw new ConnectionException("", e);
        }
    }
}
