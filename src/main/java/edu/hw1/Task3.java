package edu.hw1;

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
        int a1Min = a1[0];
        int a1Max = a1[0];
        int a2Min = a2[0];
        int a2Max = a2[0];
        for (int j : a1) {
            a1Min = Math.min(a1Min, j);
            a1Max = Math.max(a1Max, j);
        }
        for (int j : a2) {
            a2Min = Math.min(a2Min, j);
            a2Max = Math.max(a2Max, j);
        }
        return a2Min < a1Min && a1Max < a2Max;
    }
}
