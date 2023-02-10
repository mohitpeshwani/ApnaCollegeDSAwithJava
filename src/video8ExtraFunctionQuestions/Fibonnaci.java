package video8ExtraFunctionQuestions;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter upto the number:");
        int no= scanner.nextInt();
        fibo(no);
    }
    public static void fibo(int n){
        System.out.print(0);
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            System.out.print(" "+(b));
            int temp=b;
            b=a+b;
            a=temp;
        }
    }
}
