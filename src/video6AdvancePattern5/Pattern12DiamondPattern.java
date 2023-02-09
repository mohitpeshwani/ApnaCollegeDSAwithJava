package video6AdvancePattern5;
/*
    Diamond Pattern

              *
            *   *
          *   *   *
        *   *   *   *
        *   *   *   *
          *   *   *
            *   *
              *
 */
public class Pattern12DiamondPattern {
    public static void main(String[] args)
    {
        int num =4;
        // Upper triangle body
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=(4-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
        // Lower Triage
        for(int i=4;i>=0;i--)
        {
            for(int j=1;j<=(4-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*   ");
            }
            System.out.println();
        }

        }

}
