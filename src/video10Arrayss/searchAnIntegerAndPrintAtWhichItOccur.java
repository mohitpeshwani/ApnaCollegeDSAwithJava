package video10Arrayss;

import java.util.Scanner;

/*
    Taking an array of input from the user.
    Search for a given number x and print the index value at which it occurs
 */
public class searchAnIntegerAndPrintAtWhichItOccur {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= scan.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]= scan.nextInt();
        }
        System.out.println("Enter the number to be search");
        int x= scan.nextInt();
        for(int i=0;i< array.length;i++){
            if(x==array[i])
            {
                System.out.println("Element "+x+" found at the index "+i);
            }
        }
    }
}
