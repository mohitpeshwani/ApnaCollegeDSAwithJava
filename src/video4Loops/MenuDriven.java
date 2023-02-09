package video4Loops;

import java.util.Scanner;
/*
Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student&rsquo;s marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print &ldquo;This is Good&rdquo;
89 >= Marks >= 60 -> print &ldquo;This is also Good&rdquo;
59 >= Marks >= 0 -> print &ldquo;This is Good as well&rdquo;
	Because marks don&rsquo;t matter but our effort does.

 */

public class MenuDriven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag=1;
        int marks;
        do{
            System.out.println("Enter the marks:");
            marks=scan.nextInt();
            if(marks>=90){
                System.out.println("This is Good");
            }
            else if(marks>=60 &&marks<=89){
                System.out.println("This is also Good");
            }
            else{
                System.out.println("This is Good as well");
            }
            System.out.println("Enter 0 to stop and 1 to continue");
            flag=scan.nextInt();
        }while(flag==1);
    }
}
