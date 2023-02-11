package video112DArraysAndBinarySearch;

public class InfiniteArraySearchingUsingBinaryAppraochInSortedArray {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50,60,70,80,90,100
        ,110,120,140,150,150,505,545 };
        System.out.println(findInRange(array,100));
    }
    static int findInRange(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binary(arr, target, start, end);

    }
    static int binary(int []arr,int target,int start,int end){
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
