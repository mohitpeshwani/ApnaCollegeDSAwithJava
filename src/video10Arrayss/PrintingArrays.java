package video10Arrayss;
import java.util.Scanner;
/*
    Garbage collector automatically initialize proper values to the integer or non-primitve data type
    which is having edge over the other langauge like c++ where garbage value is printed
 */
public class PrintingArrays {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=3;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Printing the Numbers");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
