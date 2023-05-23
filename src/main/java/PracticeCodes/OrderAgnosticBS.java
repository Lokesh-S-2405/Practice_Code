package PracticeCodes;/*
If we are not sure whether the input is sorted in ascending or descending then using OrderAgnostic Binary Search
 */

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 21, 234, 2344};
        int target=21;
        System.out.println(orderAgnosticBinarySearch(arr,target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
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
