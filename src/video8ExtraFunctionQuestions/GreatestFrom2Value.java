package video8ExtraFunctionQuestions;

import java.util.Scanner;

public class GreatestFrom2Value {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt(), b= scan.nextInt();
        System.out.println(max(a,b));
    }
    public static int max(int no1,int no2){
        return (no1>no2)? no1: no2;
    }
}
