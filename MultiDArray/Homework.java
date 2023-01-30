package MultiDArray;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

public class Homework {

    public static int countOccurance(int[][] arr,int key){

        int counter=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if(arr[i][j]==key){
                    counter++;
                }

            }

        }
        return counter;
    }


    public static  void PrintSecondRow(int[][] arr){


        int sum=0;
            for (int j = 0; j <arr[0].length ; j++) {
                sum+=arr[1][j];
            }

        System.out.println(sum);


    }
    public static void main(String[] args) {
//        int[][] arr={ {4,7,8},{8,8,7}};
//        int key=7;
//        System.out.println(countOccurance(arr,key));
//        int[][] arr={{1,4,9},{11,4,3},{2,2,3} };
//        PrintSecondRow(arr);

        int row=2,col=3;
        int [][] matrix={{2,3,7},{5,6,7}};

        printMatrix(matrix);
        matrixTranspose(matrix,row,col);
        printMatrix(matrix);

    }

    private static void matrixTranspose(int[][] matrix,int row,int col) {

        int[][] transpose=new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                transpose[j][i]= matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {

            System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

