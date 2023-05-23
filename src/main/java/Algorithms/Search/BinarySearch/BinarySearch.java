package Algorithms.Search.BinarySearch;

/*
* Binary Search is used for sorted order i.e even in ascending or descending */
public class BinarySearch {
    public static void main(String[] args) {
    int arr[] = {-1,2,4,6,7,98};
    int target = 6;
        System.out.println(binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr, int target) {
        if(arr.length==0){
            return 0;
        }
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            } else if( target > arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
