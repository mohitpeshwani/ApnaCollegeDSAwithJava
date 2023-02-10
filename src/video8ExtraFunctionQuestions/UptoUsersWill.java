package video8ExtraFunctionQuestions;

import java.util.Scanner;

public class UptoUsersWill {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char respond;
        int positive=0,negative=0, zero=0;
        do{
            int temp= scan.nextInt();
            if(noOfPostiveZeroNegative(temp)==1){
                positive++;
            }
            else if(noOfPostiveZeroNegative(temp)==2){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("wanna continue typing y:");
            respond=scan.next().charAt(0);
        }while(respond=='y');
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.println("Zeros: "+zero);


    }
    public static int noOfPostiveZeroNegative(int no){
        int flag=0;
        if(no>0){
            flag=1;
        }
        else if(0>no){
            flag=2;
        }
        else{
            flag=3;
        }
        return flag;
    }
}