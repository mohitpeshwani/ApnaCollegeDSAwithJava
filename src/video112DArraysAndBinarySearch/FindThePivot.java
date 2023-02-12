package video112DArraysAndBinarySearch;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
public class FindThePivot {
    public static void main(String[] args) {
        int arr[]={11,13,15,1,2,3,4,5,6};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] < arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] > arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
