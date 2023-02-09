package video5patterns9;
/*
   Half Inverted Piramid and rotate
                    *
                  * *
                * * *
              * * * *
            * * * * *
 */
public class Pattern5InvertedHalfPiramidAndRotate {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
