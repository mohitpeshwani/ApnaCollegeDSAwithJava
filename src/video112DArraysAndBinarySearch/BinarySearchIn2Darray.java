package video112DArraysAndBinarySearch;
//https://leetcode.com/problems/search-a-2d-matrix/
//https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/896639609/
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter element to print");
        Scanner scan =new Scanner(System.in);
        int target =scan.nextInt();
        System.out.println("Result: "+Arrays.toString(binarySearch(arr,target)));
    }
    static int[] binarySearch(int[][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length&& col>=0)
        {
            if(arr[row][col]==target)
            {
                return new int[]{row,col};
            }
            else if(arr[row][col]>target)
            {
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
