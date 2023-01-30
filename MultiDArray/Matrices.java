package MultiDArray;

import java.util.Scanner;

public class Matrices {

    public static boolean Search(int[][] matrix,int key){

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==key)
                {
                    System.out.println("Found at ("+i+","+j+")");
                    return true;
                }

            }
        }
        System.out.println("key not found");
        return false;

    }

    public static int Largest(int[][] arr)
    {


        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }


        }

        return max;
    }

 public static int Smallest(int[][] arr)
    {


        int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }


        }

        return min;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int n=arr.length,m=arr[0].length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

//        Search(arr,6);



        System.out.println(Largest(arr));
        System.out.println(Smallest(arr));
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.pri ntln();
//        }
    }
}
