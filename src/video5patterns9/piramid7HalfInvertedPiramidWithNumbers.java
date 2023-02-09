package video5patterns9;

import java.util.Scanner;

/*
    Half Piramid With Numbers when selects column
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

    Half Pyramid With Numbers when selects Row
    5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1


 */
public class piramid7HalfInvertedPiramidWithNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the half piramid type \'row\'(default) or \'column\'");
        String s=scan.nextLine();
        if(s.equals("column") || s.equals("COLUMN") || s.equals("Column")){
            for(int i=5;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        else{
            for(int i=5;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }

        }
}
