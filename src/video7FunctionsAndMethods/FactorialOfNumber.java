package video7FunctionsAndMethods;

import java.util.Scanner;

public class FactorialOfNumber {
    public static int factorial(int no){
        if(no==0 || no ==1){
            return 1;
        }
        int fact=1;
        for(int i=2;i<=no;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scan.nextInt();
        System.out.println("Factorial Value is "+factorial(num));
    }
}
