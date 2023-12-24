package com.company;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class backTracking_concept {
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
//        obstrucle_mage("",board,0,0);

//        int [][] path = new int[board.length][board.length];
//        backtrack_by_step("",board,0,0,path, 1);

        int n=4;
        boolean[][] board1 = new boolean[n][n];
//        System.out.println(N_Queen_solver(board1,0));
//        K_Night(board1,0,0,8);

//        ------------------------------------------------------------------------------------------

        int [][] board_su = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solve(board_su)){
            display_for_sudoku(board_su);
        }else {
            System.out.println("cannot solve");
        }

    }


    public static void obstrucle_mage(String p,boolean [][]maze, int r, int c){
        if (r==maze[0].length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            obstrucle_mage(p+'D',maze,r+1,c);

        }
        if(c<maze[0].length-1){
            obstrucle_mage(p+'R',maze,r,c+1);

        }
        if(c>0){
            obstrucle_mage(p+'L',maze,r,c-1);

        }
        if(r>0){
            obstrucle_mage(p+'U',maze,r-1,c);
        }
        maze[r][c]=true;

    }

    public static void backtrack_by_step(String p,boolean [][]maze, int r, int c,int [][] path, int step){
        if (r==maze[0].length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;

        if(r<maze.length-1){
            backtrack_by_step(p+'D',maze,r+1,c,path, step+1);

        }
        if(c<maze[0].length-1){
            backtrack_by_step(p+'R',maze,r,c+1,path, step+1);

        }
        if(c>0){
            backtrack_by_step(p+'L',maze,r,c-1,path, step+1);

        }
        if(r>0){
            backtrack_by_step(p+'U',maze,r-1,c,path, step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;

    }
    ////--------------------------------------------------------------------N-Queen-------------------------------

    public static int N_Queen_solver(boolean [][] board, int row){
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(is_safe(board, row, col)) {
                board[row][col] = true;
                count += N_Queen_solver(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean is_safe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }


    ////------------------------------------------------------------------------N-knight-------------------------

    static void K_Night(boolean [][] board, int row, int col, int knight){
        if (knight == 0) {
            diplay_knight(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            K_Night(board, row + 1, 0, knight);
            return;
        }

        if (is_safe_for_knight(board, row, col)) {
            board[row][col] = true;
            K_Night(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }

        K_Night(board, row, col + 1, knight);
    }

    private static boolean is_safe_for_knight(boolean[][] board, int row, int col) {
        if (is_valid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (is_valid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (is_valid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (is_valid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }


    static boolean is_valid(boolean[][] board,int row, int col){
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void diplay_knight(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }


    ////------------------------------------------sudoku_solver------------------------------------------------
    public static boolean solve(int [][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing the r,c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (emptyLeft == false) {
                break;
            }
        }

        if (emptyLeft == true) {
            return true;
            // soduko is solved
        }
        //backtrack
        for (int number = 1; number <= 9; number++) {
            if (is_safe_sudoku(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {

                    return true;//found anser
                }
                else {
                    board[row][col] =0;//backtrack if you not get answer
                }
            }
        }
        return false;
    }

    private static void display_for_sudoku(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static boolean is_safe_sudoku(int [][] board, int row, int col, int num){

        //check the row
        for (int i = 0; i < board.length; i++) {
            //check if the no is in the row
            if (board[row][col]==num){
                return false;
            }
        }
        //check the colum
        for (int [] nums : board) {
            //check if the no is in the row
            if (nums[col] == num){
                return false;
            }
        }

        //for that box
        int sqrt = (int)(Math.sqrt(board.length));
        int row_start = row-row%sqrt;
        int col_start = col-col%sqrt;
        //start box iteration
        for (int r=row_start; r<row_start+sqrt; r++){
            for (int c = col_start; c < col_start + sqrt; c++) {
                if (board[r][c]==num){
                    return false;
                }
            }
        }return true;
    }

}

