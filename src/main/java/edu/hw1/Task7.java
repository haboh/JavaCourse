package edu.hw1;

public class Task7 {

    public static final int BIT_LENGTH = 32;

    private Task7() {
    }

    private static int getBit(int n, int i) {
        return ((1 << i) & n) == 0 ? 0 : 1;
    }

    public static int rotateLeft(int n, int shift) {
        int numLength = getNumLength(n);

        int result = 0;
        for (int i = 0; i < numLength; i++) {
            int bit = (i - shift + numLength) % numLength;
            result += (1 << i) * getBit(n, bit);
        }

        return result;
    }

    private static int getNumLength(int n) {
        int numLength = 0;
        for (int i = 0; i < BIT_LENGTH; i++) {
            if (getBit(n, i) == 1) {
                numLength = i + 1;
            }
        }
        return numLength;
    }

    public static int rotateRight(int n, int shift) {
        int numLength = getNumLength(n);

        int result = 0;
        for (int i = 0; i < numLength; i++) {
            int bit = (i + shift) % numLength;
            result += (1 << i) * getBit(n, bit);
        }

        return result;
    }
}
