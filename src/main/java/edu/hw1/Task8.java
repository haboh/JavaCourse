package edu.hw1;

public class Task8 {
    private Task8() {
    }

    private static final int[] DX = {-1, -1, -2, -2, 1, 1, 2, 2};
    private static final int[] DY = {-2, 2, -1, 1, 2, -2, 1, -1};

    private static final int FIELD_SIZE = 8;

    private static boolean okCell(int x, int y) {
        return 0 <= x && x < FIELD_SIZE && 0 <= y && y < FIELD_SIZE;
    }

    public static boolean knightBoardCapture(int[][] field) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j] == 1) {
                    for (int d = 0; d < DX.length; d++) {
                        int nx = i + DX[d];
                        int ny = j + DY[d];
                        if (okCell(nx, ny) && field[nx][ny] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
