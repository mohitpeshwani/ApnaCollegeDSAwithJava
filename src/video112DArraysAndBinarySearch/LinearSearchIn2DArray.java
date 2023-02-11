package video112DArraysAndBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number of rows,column: ");
        int row=scan.nextInt(),col= scan.nextInt();
        int arrays[][] =new int[row][col];
        for(int i=0;i<row;i++){
            System.out.println("Enter the elements for ("+ i+") row:");
            for(int j=0;j<col;j++){
                arrays[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the element looking to search");
        int target= scan.nextInt();
        System.out.println("Element found at the location: "+ Arrays.toString(linearSearch(arrays,target)));
    }
    public static int[] linearSearch(int arr[][],int target){
        int ans[]={0,0};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return  ans;
                }
            }
        }


        return new int[]{-1,-1};
    }
}
