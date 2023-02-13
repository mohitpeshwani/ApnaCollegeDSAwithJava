package video11multi_DArraysAndBinarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Using the linear search
public class FindFirstandLastPositionofElementinSortedArray1stBruteForceApproach {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(new Solve().searchRange(nums,target)));
    }
}


class Solve {
    public int[] searchRange(int[] nums, int target) {
        int[] answer={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                answer[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                answer[1]=i;
                break;
            }
        }
        return answer;

    }
}
