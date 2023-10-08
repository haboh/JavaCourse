package edu.hw1;

public class Task1 {
    private static final int SECONDS_IN_MINUTE = 60;

    private Task1() {
    }

    public static int minutesToSeconds(String time) {
        if (!time.matches("[0-9]+:[0-5][0-9]")) {
            return -1;
        }
        String[] minutesAndSeconds = time.split(":");
        int minutes = Integer.parseInt(minutesAndSeconds[0]);
        int seconds = Integer.parseInt(minutesAndSeconds[1]);
        return minutes * SECONDS_IN_MINUTE + seconds;
    }
}
