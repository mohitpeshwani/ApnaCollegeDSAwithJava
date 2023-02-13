package video16Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={10,22,32,123,12,33};
        System.out.println("Sorted Arrays:"+Arrays.toString(insertionSorted(arr)));


    }
    static int[] insertionSorted(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            System.out.println("Pass"+i);
            int sorted=arr[i];
            int unsorted =i-1;
            while(unsorted>=0 && arr[unsorted]>sorted)
            {
                System.out.println("Before sorting:"+Arrays.toString(arr));
                arr[unsorted+1] =arr[unsorted];
                unsorted--;
            }
            arr[unsorted+1]=sorted;
            System.out.println("endpoint:"+unsorted);
        }
        return arr;
    }
}
