package video4Loops;

import java.util.ArrayList;
import java.util.*;

/*
* Print all even numbers till n.
* */
public class PrintAllEvenNoTillN {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       int i=scan.nextInt();
        System.out.println(evenNo(i));
    }
    static List<Integer> evenNo(int no){
        ArrayList<Integer> ans =new ArrayList();
        for(int i=1;i<=no;i++){
            if(i%2==0){
                ans.add(i);
            }
        }
        return ans;
    }
}
