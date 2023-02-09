package video5patterns9;
/*
    Printing the Solid Rhombus
    n=10
             * * * * *
            * * * * *
           * * * * *
          * * * * *
 */
public class PatternHm1SolidRombus {
    public static void main(String[] args) {
        int n=5;
        // Outer loop for till n
        for(int i=1;i<=n;i++){
            //1st Inner loop  To print the spaces first
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //2nd Inner loop to print he stars
            for(int j=1;j<=5;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
