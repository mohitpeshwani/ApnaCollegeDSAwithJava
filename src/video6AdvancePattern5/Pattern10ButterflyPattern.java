package video6AdvancePattern5;
/*
    ButterFly Pattern
    *             *
    * *         * *
    * * *     * * *
    * * * * * * * *
    * * * * * * * *
    * * *     * * *
    * *         * *
    *             *
 */
public class Pattern10ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        //Upper Part of butterfly
        for (int i = 1; i <= n; i++) {
            //Printing the left side of butterfly half pyramid logic
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Printing the spaces 2(n-i) better to go with 2 spaces for reduce time
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("    ");
            }
            //Printing the Right side of butterfly half pyramid logic
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower part similar just start from n to 1 and internall all are the same
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= (n - i); j++) {
                System.out.print("    ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


