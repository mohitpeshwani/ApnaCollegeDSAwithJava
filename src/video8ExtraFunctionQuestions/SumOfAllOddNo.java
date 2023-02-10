package video8ExtraFunctionQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAllOddNo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int no){
        return no*no;
    }
}
