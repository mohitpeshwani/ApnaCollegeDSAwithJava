package video112DArraysAndBinarySearch;
//https://leetcode.com/problems/find-peak-element/description/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakInMountainArraysUsingLinearApproach {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        System.out.println("Peak element found at index "+new PeakInMountainArraysUsingLinearApproach().findPeakElement(arr)+" value is "+arr[new PeakInMountainArraysUsingLinearApproach().findPeakElement(arr)]);
        }
    public int findPeakElement(int[] nums) {
        int peak=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]>nums[i]){
                peak=i+1;
            }
        }
        return peak;
    }
}
