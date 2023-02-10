package video8ExtraFunctionQuestions;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= scanner.nextInt();
        System.out.println("Enter the power of");
        int power= scanner.nextInt();
        System.out.println(raiseto(number,power));
    }
    public static int raiseto(int number,int power){
        if(power==1){
            return number;
        }
        int temp=1;
        for(int i=0;i<power;i++){
            temp*=number;
        }
        return temp;
    }
}
