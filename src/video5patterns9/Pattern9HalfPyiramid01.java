package video5patterns9;
/*
    Need to print the 0 1 manner
    Suppose n --> 5
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */
public class Pattern9HalfPyiramid01 {
    public static void main(String[] args) {
        int n=5;

        //1st Way to perform this
        // Outer Loop
//        for(int i=1;i<=n;i++){
//            //Inner Loop
//            for(int j=i;j>=1;j--){
//                if(j%2==1) {
//                    System.out.print("1 ");
//                }
//                else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

        //nd Way to perform this
        //Outer Loop
        for(int i=1;i<=n;i++){
            //Inner Loop
            for(int j=i;j>=1;j--){
                int flag=(j%2==0) ? 0 : 1;
                System.out.print(flag+" ");
            }
            System.out.println();
        }
    }
}
