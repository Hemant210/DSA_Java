package Leetcode;
//Time complexity = O(n*n)

import java.util.ArrayList;
import java.util.List;

public class Backtracking_Queen {
    public boolean isSafe(int row, int col, char[][] board){
        //Horizantal
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int i=0; i<board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //Upper left
        int r = row;
        for(int c=col; c>0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //Upper Right
        r = row;
        for(int c=col; c<board.length &&  r>=0; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //Lower Left
        r = row;
        for(int c=col; c>=0 && r<board.length &&  r>=0; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //Lower right
        for(int c=col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }    
        }
        return false;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> new_board = new ArrayList<>();

        for(int i = 0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            new_board.add(row);
        }

        allBoards.add(new_board);
        }

    public void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int row = 0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, null, col+1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new board[n][n];

        helper(board, null, 0);
    }

    public void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));        
    }
}
