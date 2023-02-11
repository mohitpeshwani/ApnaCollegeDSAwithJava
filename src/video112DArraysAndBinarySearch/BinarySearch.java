package video112DArraysAndBinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,22,44,56,90};
        int target = 56;
        System.out.println("Element "+target+" found at index: "+ binary(arr,target));
    }
    static int binary(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
