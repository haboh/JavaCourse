package edu.hw1;

import java.util.Arrays;

public class Task6 {
    public static int countK(int number) {
        if (number <= MIN_BOUND || number >= MAX_BOUND) {
            return -1;
        }
        if (number == KAPREKARA_NUMBER) {
            return 0;
        }
        char[] num = Integer.toString(number).toCharArray();
        Arrays.sort(num);
        String ascending = new String(num);
        String descending = new StringBuilder().append(num).reverse().toString();
        return countK(Integer.parseInt(descending) - Integer.parseInt(ascending)) + 1;
    }

    private static final int MIN_BOUND = 1000;
    private static final int MAX_BOUND = 10000;
    private static final int KAPREKARA_NUMBER = 6174;

    private Task6() {
    }
}
