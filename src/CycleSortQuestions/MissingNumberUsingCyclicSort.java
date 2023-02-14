package CycleSortQuestions;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
class MissingNumberUsingCyclicSort {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1,3};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
         int current = arr[i]; // whenever we have o to n never add -1 else -1;
         if(arr[i]!=i)
         {
             int temp=arr[i];
             arr[i]=arr[current];
             arr[current]=temp;
         }
         else
         {
             i++;
         }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }
}