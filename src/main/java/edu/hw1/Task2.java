package edu.hw1;

public class Task2 {
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

    private static final int BASE = 10;

    private Task2() {
    }
}
