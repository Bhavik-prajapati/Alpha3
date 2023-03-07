package Backtracking;

public class Sudoku {
    public static boolean SudokuSolver(int[][] sudoku,int row,int col){

        if(row==9 && col==0){
            return true;
        }


        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return SudokuSolver(sudoku,nextRow,nextCol);
        }
        for (int digit = 0; digit <=9; digit++) {
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(SudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }


        }
        return false;

    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {

        //col
        for (int i = 0; i < 8; i++) {
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for (int j = 0; j < 8; j++) {
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        //grid

        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j <sc+3 ; j++) {

                if(sudoku[i][j]==digit){
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 6, 8, 0},
                {0, 0, 0, 0, 7, 3, 0, 0, 9},
                {3, 0, 9, 0, 0, 0, 0, 4, 5},
                {4, 9, 0, 0, 0, 0, 0, 0, 0},
                {8, 0, 3, 0, 5, 0, 9, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 3, 6},
                {9, 6, 0, 0, 0, 0, 3, 0, 8},
                {7, 0, 0, 6, 8, 0, 0, 0, 0},
                {0, 2, 8, 0, 0, 0, 0, 0, 0}
        };

        if(SudokuSolver(board,0,0)){
            System.out.println("solution exist");
            printSudoku(board);
        }else{
            System.out.println("not exist");
        }

    }

    private static void printSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                System.out.print(board[i][j]+" ");

            }
            System.out.println("");

        }
    }
}
