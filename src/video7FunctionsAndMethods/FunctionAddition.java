package video7FunctionsAndMethods;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class FunctionAddition {
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Two Numbers:");
        int no1= scan.nextInt();
        int no2= scan.nextInt();
        System.out.println("Addition is :"+add(no1,no2));

    }
}
