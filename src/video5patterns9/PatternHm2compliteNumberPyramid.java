package video5patterns9;
/*
    Printing the complete Pyramid with number
                1
               2  3
              4  5  6
             7  8  9  10
            11  12  13  14
 */
public class PatternHm2compliteNumberPyramid {
    public static void main(String[] args) {
        int n=5;
        int counter=0;
        for(int i=1;i<=n;i++){
            //1st inner loop for left side space
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //2nd inner loop for printing the * pattern with counter
            for(int j=1;j<=i;j++){
                counter++;
                System.out.print(counter+"  ");
            }
            //3st inner loop for same for  right side space
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
