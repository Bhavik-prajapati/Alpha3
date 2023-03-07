package Backtracking;

public class NqueenPrint1SolutionOnly {

    public static void printboard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("----");
    }
    static int counter;
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
//        Nqueens(board,0);
//        System.out.println("counter is "+counter);

        if(Nqueens(board,0)){
            System.out.println("solution possible");
            printboard(board);
        }else{
            System.out.println("not possible solution exist...");

        }
    }

    private static boolean Nqueens(char[][] board, int row) {

        if(row==board.length){
//            printboard(board);
            counter++;
            return true;

        }

        for (int j = 0; j < board.length; j++) {


            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(Nqueens(board,row+1)){
                    return true;
                }
                board[row][j]='X';
            }
        }

    return false;
    }

    public static boolean isSafe(char[][] board,int row, int col){
        //verticle up
        for (int i = row-1; i >=0 ; i--) {

            if(board[i][col]=='Q'){
                return false;
            }

        }

        //left diagonal
        for (int i = row-1, j =col-1 ; i>=0 && j>=0 ; i--,j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //right diagonal up
        for (int i = row-1,j=col+1;i>=0 && j<board.length;i--,j++) {

            if(board[i][j]=='Q'){
                return false;
            }

        }
        return true;



    }

}
