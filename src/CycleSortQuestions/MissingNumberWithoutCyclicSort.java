package CycleSortQuestions;
import java.util.*;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class MissingNumberWithoutCyclicSort {
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1,1};
        System.out.println(findDuplicates(nums));

    }

        static public List<Integer> findDuplicates(int[] nums) {
            List<Integer> answer=new ArrayList();
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]==nums[i+1]&& i<nums.length)
                {
                    if(answer.contains(nums[i]))
                    {
                        continue;
                    }
                    else
                    {
                        answer.add(nums[i]);
                    }
                }
            }
            return answer;
        }
}
