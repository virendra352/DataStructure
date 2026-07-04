package com.java.DataStructure.algorithms.Algorithms;

import java.util.*;

public class NQueenSolution {
       static List<List<String>> result = new ArrayList<>();
        public static List<List<String>> solveNQueens(int n) {
            char[][] board = new char[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(board[i], '.');
            }
            backtrack(0,board,n);
            return result;
        }
        private static void backtrack(int row, char[][] board, int n) {

            // If all queens are placed
            if (row == n) {
                result.add(constructBoard(board));
                return;
            }

            // Try each column in current row
            for (int col = 0; col < n; col++) {

                if (isSafe(row, col, board, n)) {
                    // Place queen
                    board[row][col] = 'Q';

                    // Go to next row
                    backtrack(row + 1, board, n);

                    // Remove queen (backtrack)
                    board[row][col] = '.';
                }
            }
        }

        private static boolean isSafe(int row, int col, char[][] board, int n) {

            // Check same column (upwards)
            for (int i = 0; i < row; i++) {
                if (board[i][col] == 'Q') {
                    return false;
                }
            }

            //Check upper-left diagonal
            for (int i = row - 1, j = col - 1;
                 i >= 0 && j >= 0;
                 i--, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            // Check upper-right diagonal
            for (int i = row - 1, j = col + 1;
                 i >= 0 && j < n;
                 i--, j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            return true;
        }
        private static List<String> constructBoard(char[][] board) {
            List<String> list = new ArrayList<>();
            for (char[] row : board) {
                list.add(new String(row));
            }
            return list;
        }

    public static void main(String[] args) {
        List<List<String>> listList = solveNQueens(4);
        System.out.println(listList);
    }
}
