package video5patterns9;
/*
    Complete Pyramid palindronic
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
  */
public class PatterHm3PalindronicPyramid {
    public static void main(String[] args) {
        int n=5;
        //Outer Loop for no of rows time
        for(int i=1;i<=5;i++){
            int temcounter=0;
            //1st inner loop for the left spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //print the number from bigger to smaller using the temparary counter increment it
            for(int j=1;j<=i;j++){
                temcounter++;
                System.out.print(temcounter+" ");
            }
            //print the number from small to bigger using the same temparary counter decrementing it
            for(int j=1;j<i;j++){
                temcounter--;
                System.out.print(temcounter+" ");
            }
            //4th inner loop for the left spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

