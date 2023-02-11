package video112DArraysAndBinarySearch;

public class CeilingNumberBinarySearch {
    public static void main(String[] args) {
        int[] arr={2,5,6,7,8,9,10,12,16};
        int target=15;
        int respond = ceilingNumber(arr,target);
        System.out.println("Nearest value for the number is :"+respond);
    }
    public static int ceilingNumber(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(target==arr[m])
            {
                return m;
            }
            else if(target>arr[m])
            {
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return arr[s];
    }
}
