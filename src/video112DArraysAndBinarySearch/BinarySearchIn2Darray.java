package video112DArraysAndBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn2Darray {
    public static void main(String[] args) {
        int[][] arrd2d={ { 10,20,30,50,60,70},
                         {80,90,100,120,140},
                         {160,190,300,304,606}};
        System.out.println(Arrays.deepToString(arrd2d));
        System.out.println("Enter element to print");
        Scanner scan =new Scanner(System.in);
        int target =scan.nextInt();
        System.out.println("Result: "+binarySearch(arrd2d,target));
    }
    static boolean binarySearch(int[][] arr,int target){
        for(int[] row:arr){
            for(int col:row){
                if(col==target){
                    return true;
                }
            }
        }
        return false;
    }
}
