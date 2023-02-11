package video112DArraysAndBinarySearch;

public class OrderAgnosticsInBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,22,44,56,90};
        int[] arr2={90,56,44,22,6,5,4,3,2,1};
        int target = 56;
        int target2 =1;
        System.out.println("Element "+target+" found at index: "+ OrderAgnositcsbinary(arr,target));
        System.out.println("Element "+target+" found at index: "+ OrderAgnositcsbinary(arr2,target2));
    }
    static int OrderAgnositcsbinary(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAssending =(arr[start]>arr[end]); // main logic if the value is asending or decending can check from this point if true means Dece order
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(isAssending){
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
