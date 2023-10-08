package edu.hw1;

public class Task3 {
    private static final int BASE = 10;

    private Task3() {
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        int leftNumber = number;
        while (leftNumber != 0) {
            count++;
            leftNumber /= BASE;
        }

        return count;
    }
}
