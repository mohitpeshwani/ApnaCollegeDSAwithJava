package video4Loops;

import java.util.Scanner;

public class printPrimeNo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int no = scan.nextInt();
        if(primeNo(no)){
            System.out.println(no+" is Prime number");
        }
        else{
            System.out.println(no+" is not prime number");
        }

    }
    static boolean primeNo(int no){
        for(int i = 2;i<no;i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
    }
}
