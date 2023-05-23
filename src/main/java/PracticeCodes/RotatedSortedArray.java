package PracticeCodes;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {9,10,13,14,7,8};
        int target = 7;
        int pivot = findPivot(arr);
        System.out.println(pivot);
        int result;
        if(pivot==-1){
           result= binarySearchArray(arr,target,0,arr.length-1);
            System.out.println(result);
        }
        int firstSearch = binarySearchArray(arr, target, 0, pivot);
        if(firstSearch==-1){
            result = binarySearchArray(arr, target, pivot, arr.length-1);
            System.out.println(result);
        }
        System.out.println(firstSearch);

    }

    private static int binarySearchArray(int[] arr, int target,int start,int end) {
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end =arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
