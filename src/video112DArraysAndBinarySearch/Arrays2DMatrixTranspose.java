package video112DArraysAndBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2DMatrixTranspose {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number of Elements");
        int row=scan.nextInt();
        int col= scan.nextInt();

        int[][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            System.out.println("Enter the elements of row ("+i+") :");
            for(int j=0;j<col;j++){
                matrix[i][j]= scan.nextInt();
            }
        }
        System.out.println("Normal matrix");
        // Printing using enhance two loops
        for(int[] r:matrix)
        {
            for(int c:r){
                System.out.print(c+" ");
            }
            System.out.println();
        }


        int traversed[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                traversed[i][j]=matrix[j][i];
            }
        }
        System.out.println("Traversed Matrix");
        //Enhance for loop with the Arrays.toString method
        System.out.println("[");
        for(int []r:traversed){
            System.out.println(Arrays.toString(r));
        }
        System.out.println("]");
    }
}
