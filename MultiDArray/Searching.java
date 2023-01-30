package MultiDArray;

import java.util.Arrays;

public class Searching {

    public static boolean LinearSearch(int[][] arr,int key){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if(arr[i][j]==key){
                    return true;
                }

            }

        }
        return false;
    }

    public static boolean StairCaseSearch(int[][] arr,int key){

        int row=0,col=arr.length-1;
        while (row<arr.length && col>=0){

            if (arr[row][col] == key) {

                System.out.println("found at "+row+","+col);
                return true;
            }else if(key<arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
//        System.out.println(LinearSearch(matrix,39));
        System.out.println(StairCaseSearch(matrix,33));


    }
}
