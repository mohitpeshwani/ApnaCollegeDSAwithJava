package video10Arrayss;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/*
Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.

 */
public class IsAssending {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]= scan.nextInt();
        }
        boolean flag=true;
        for(int i=0; i<array.length-1; i++)
        {
            if(array[i] > array[i+1])
            {
                flag = false;
            }
        }

        if(flag)
            System.out.println("Assending array "+ Arrays.toString(array));
        else
            System.out.println("Not the Assending Array"+array);
    }

}
