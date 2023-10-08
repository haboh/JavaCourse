package edu.hw1;

import java.util.Arrays;

public class Task3 {
    private Task3() {
    }

    public static boolean countDigits(int[] a1, int[] a2) {
        if (a1.length == 0) {
            return false; // empty array can be put anywhere
        }
        if (a2.length == 0) {
            return true; // nothing can be put inside empty array
        }
        int a1_min = a1[0], a1_max = a1[0];
        int a2_min = a2[0], a2_max = a2[0];
        for (int j : a1) {
            a1_min = Math.min(a1_min, j);
            a1_max = Math.max(a1_max, j);
        }
        for (int j : a2) {
            a2_min = Math.min(a2_min, j);
            a2_max = Math.max(a2_max, j);
        }
        return a2_min < a1_min && a1_max < a2_max;
    }
}
