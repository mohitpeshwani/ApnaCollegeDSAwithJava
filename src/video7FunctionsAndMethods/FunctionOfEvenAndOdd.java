package video7FunctionsAndMethods;

import java.util.Scanner;

public class FunctionOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        System.out.println(evenOrOdd(a));

    }
    public static String evenOrOdd(int num){
        return (num%2==0)? num+" is even" : num+" is odd";
    }
}
