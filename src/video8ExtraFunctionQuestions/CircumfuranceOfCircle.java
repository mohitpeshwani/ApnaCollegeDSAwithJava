package video8ExtraFunctionQuestions;

import java.util.Scanner;

public class CircumfuranceOfCircle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Radius");
        int radius= scan.nextInt();
        System.out.println("Circumference of circle: "+circum(radius));
    }
    public static float circum(int rad){
        return (float) (2*(Math.PI)*rad);
    }
}
