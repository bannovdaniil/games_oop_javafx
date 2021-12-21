package ru.job4j.puzzle;

public class Win {
    private static boolean checkHorizLine(int[][] board, int horizLine) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[horizLine][i] == 1) {
                count++;
            }
        }
        return count == board.length;
    }

    private static boolean checkVertLine(int[][] board, int vertLine) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][vertLine] == 1) {
                count++;
            }
        }
        return count == board.length;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1
                    &&
                    (checkHorizLine(board, i) || checkVertLine(board, i))
            ) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}

