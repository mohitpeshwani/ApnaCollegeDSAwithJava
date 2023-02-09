package video3SwitchCase;

import java.util.Scanner;

/*
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.

*/
public class SwitchCase {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Enter the operation to perform:\n 1: + Addition a+b\n 2: - Subtraction a-b \n 3: * Multiplication a*b \n 4: / Division a/b \n5 % Modulo a%b");
        char ch=scan.next().charAt(0);
        switch (ch){
            case '+'-> System.out.println("Addition of two no:"+(a+b));
            case '-'-> System.out.println("Subtraction of two no:"+(a-b));
            case '*'-> System.out.println("Multiplication of two no:"+(a*b));
            case '/'-> System.out.println("Divison of two no:"+(a/b));
            case '%'-> System.out.println("Reminder of Result:"+(a%b));
            default -> System.out.println("Invalid character");
        }

    }

}
