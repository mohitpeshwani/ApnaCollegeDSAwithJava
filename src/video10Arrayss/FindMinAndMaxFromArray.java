package video10Arrayss;

public class FindMinAndMaxFromArray {
    public static void main(String[] args) {
        int[] array={24444,45,66,55,33344,666,434};
        int max=0, min=array[0];
        for(int i=0;i< array.length;i++){
            max=Math.max(max,array[i]);
            min=Math.min(min,array[i]);
        }
        System.out.println("Minimum:"+min);
        System.out.println("Maximum:"+max);
    }
}
