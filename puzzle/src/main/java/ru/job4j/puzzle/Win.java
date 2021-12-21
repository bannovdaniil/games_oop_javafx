package ru.job4j.puzzle;

public class Win {
    private static boolean checkHorizontalLine(int[][] board, int horizontalLine) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[horizontalLine][i] == 1) {
                count++;
            }
        }
        return count == board.length;
    }

    private static boolean checkVerticalLine(int[][] board, int verticalLine) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][verticalLine] == 1) {
                count++;
            }
        }
        return count == board.length;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHorizontalLine(board, i) || checkVerticalLine(board, i))) {
                rsl = true;
            }
        }
        return rsl;
    }
}

