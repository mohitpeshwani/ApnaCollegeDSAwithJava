package video7FunctionsAndMethods;

import java.util.Scanner;

public class FunctionOfPrimeNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scan.nextInt();
        System.out.println(prime(num));
    }
    public static String prime(int no){
        if(no==1){
            return no+" Is not prime";
        }
        for(int i=2;i<no;i++){
            if(no%i==0){
                return no+" Is not prime";
            }
        }
        return no+ " is prime";
    }

}
