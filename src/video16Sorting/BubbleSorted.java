package video16Sorting;

import java.util.Arrays;

public class BubbleSorted {
    public static void main(String[] args) {
        int[] arr={10,32,34,22,21,18};
        // In bubble sort we compare the (j) with it's adjacent element while in selection sort ith index compare with all other elements till end
        // In bubble sort we found largest element first while in selection sort we found smallest element first starting from zero for ascending order
        // Just inverting the conditions both of them can act as the descending order
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println((i+1)+ " Pass:\n");
            for(int j=0;j<arr.length-i-1;j++)
            {
                System.out.print("Before swapping "+j+" "+(j+1)+" postitions : "+Arrays.toString(arr)+"---->");
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                //An optional part just to better understanding added this part
                System.out.println(Arrays.toString(arr));


            }
        }
        return arr;
    }
}
