package Leetcode;

// 37. Sudoku Solver
public class Sudoku_solver {

    // Checks if placing `number` at (row, col) is valid
    public static boolean isSafe(char[][] board, int row, int col, int number) {
        char numChar = (char) (number + '0'); // Correct char conversion

        // Check row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == numChar) {
                return false;
            }
            if (board[row][i] == numChar) {
                return false;
            }
        }

        // Check 3x3 subgrid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == numChar) {
                    return false;
                }
            }
        }

        return true;
    }

    // Backtracking helper
    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int new_row = 0;
        int new_col = 0;

        if (col != board.length - 1) {
            new_row = row;
            new_col = col + 1;
        } else {
            new_row = row + 1;
            new_col = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, new_row, new_col);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');

                    if (helper(board, new_row, new_col)) {
                        return true;
                    } else {
                        board[row][col] = '.'; // Backtrack
                    }
                }
            }
        }

        return false; // No valid number found
    }

    public static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        solveSudoku(board);

        // Print solved board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
