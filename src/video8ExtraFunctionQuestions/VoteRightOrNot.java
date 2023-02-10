package video8ExtraFunctionQuestions;

import java.util.Scanner;

public class VoteRightOrNot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age to check the eligibility for vote: ");
        int age=scan.nextInt();
        System.out.println("You are "+eligible(age));
    }
    public static String eligible(int ages){
        return (ages>=18)? "Eligible as you are "+ages : "Not eligible as your age less than 18";
    }
}
