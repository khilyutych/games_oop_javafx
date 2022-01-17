package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 1) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
            if(result) {
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != 1) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
            if(result) {
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        return (monoHorizontal(board) || monoVertical(board));
    }
}


