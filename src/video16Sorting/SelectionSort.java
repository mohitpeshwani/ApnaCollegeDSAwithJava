package video16Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {50, 10, 20, 40, 55};
        //Selection Sort
        //We will always compare the ith index with all other index
        System.out.println("SORTED ARRAY IS "+Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println((i+1)+ " Pass:\n");
            for(int j=i+1;j<=arr.length-1;j++)
            {
                System.out.print("Before swapping "+i+" "+j+" postitions : "+Arrays.toString(arr)+"---->");
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                System.out.println(Arrays.toString(arr)+"\n");
            }
        }
        return arr;
    }

}