package ru.job4j.puzzle;

public class Win {
    private static boolean checkHorizLine(int[][] board, int horizLine) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[horizLine][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean checkVertLine(int[][] board, int vertLine) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][vertLine] != 1) {
                result = false;
                break;
            }
        }
        return result;
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

