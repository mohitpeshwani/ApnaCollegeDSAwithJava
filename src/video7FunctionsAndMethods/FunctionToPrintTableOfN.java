package video7FunctionsAndMethods;

import java.util.Scanner;

public class FunctionToPrintTableOfN {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int a= scan.nextInt();
        table(a);
    }
    static void table(int no){
        for(int i=1;i<=10;i++){
            System.out.println(no+" * "+i+" = "+(no*i));
        }
    }
}
