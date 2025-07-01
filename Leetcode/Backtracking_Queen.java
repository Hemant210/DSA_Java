package Leetcode;
//Time complexity = O(n*n)
//51. N-Queens
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtracking_Queen {
        public static boolean isSafe(int row, int col, char[][] board) {
            // Check left side of row
            for (int j = 0; j < col; j++) {
                if (board[row][j] == 'Q') return false;
            }
    
            // Check upper left diagonal
            for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') return false;
            }
    
            // Check lower left diagonal
            for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
                if (board[i][j] == 'Q') return false;
            }
    
            return true;
        }
    
        public static void saveBoard(char[][] board, List<List<String>> allBoards) {
            List<String> newBoard = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String row = "";
                for (int j = 0; j < board.length; j++) {
                    row += board[i][j];
                }
                newBoard.add(row);
            }
            allBoards.add(newBoard);
        }
    
        public static void helper(char[][] board, List<List<String>> allBoards, int col) {
            if (col == board.length) {
                saveBoard(board, allBoards);
                return;
            }
    
            for (int row = 0; row < board.length; row++) {
                if (isSafe(row, col, board)) {
                    board[row][col] = 'Q';
                    helper(board, allBoards, col + 1);
                    board[row][col] = '.';
                }
            }
        }
    
        public static List<List<String>> solveNQueens(int n) {
            List<List<String>> allBoards = new ArrayList<>();
            char[][] board = new char[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(board[i], '.');
            }
            helper(board, allBoards, 0);
            return allBoards;
        }
    
        public static void main(String[] args) {
            int n = 4; // You can change N here
            List<List<String>> solutions = solveNQueens(n);
            int count = 1;
            for (List<String> board : solutions) {
                System.out.println("Solution " + count + ":");
                for (String row : board) {
                    System.out.println(row);
                }
                System.out.println();
                count++;
            }
        }
    }
    