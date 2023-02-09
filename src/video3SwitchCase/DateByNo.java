package video3SwitchCase;

import java.util.Scanner;
/*
Ask the user to enter the number of the month & print the name of the month.
For eg - For ‘
1’ print ‘January’,
‘2’ print ‘February’
 & so on.*/

public class DateByNo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number from 1 to 12");
        int month = scan.nextInt();
        switch (month){
            case 1-> System.out.println("jan");
            case 2-> System.out.println("Feb");
            case 3-> System.out.println("March");
            case 4-> System.out.println("April");
            case 5-> System.out.println("May");
            case 6-> System.out.println("June");
            case 7-> System.out.println("july");
            case 8-> System.out.println("August");
            case 9-> System.out.println("September");
            case 10-> System.out.println("October");
            case 11-> System.out.println("November");
            case 12-> System.out.println("December");
            default -> System.out.println("Please add from 1 to 12");
        }
    }
}
