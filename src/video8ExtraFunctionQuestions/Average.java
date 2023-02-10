package video8ExtraFunctionQuestions;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the three Numbers");
        int a= scan.nextInt(), b= scan.nextInt(), c= scan.nextInt();
        System.out.println("Average:"+avg(a,b,c));
    }
    public static int avg(int a,int b,int c){
        return (a+b+c)/3;
    }
}
