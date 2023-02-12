package video112DArraysAndBinarySearch;
// https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,33,23};
        int target =20;
        System.out.println(search(arr,target));

    }
        static int search(int[] arr, int target) {
            int peak = peakIndexInMountainArray(arr);
            int firstTry = orderAgnosticBS(arr, target, 0, peak);
            if (firstTry != -1) {
                return firstTry;                   //trying in first half
            }
            return orderAgnosticBS(arr, target, peak+1, arr.length - 1); //looking in the second half of the array
        }

        public static int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid+1]) {
                    end = mid;
                } else {
                    start = mid + 1; // because we know that mid+1 element > mid element
                }
            }
            return start;
        }

        static int orderAgnosticBS(int[] arr, int target, int start, int end) {
            boolean isAsc = arr[start] < arr[end];

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                }

                if (isAsc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
}