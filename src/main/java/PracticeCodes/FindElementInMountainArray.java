package PracticeCodes;

public class FindElementInMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5,3,1};
        int target = 2;
        int search = search(arr, target);
        System.out.println(search);
    }

    private static int search(int[] arr, int target) {
        System.out.println("hello");
        int maxPeekIndex = findMaxPeekIndex(arr);
        int firstIndex = findFirstIndex(arr, target, 0, maxPeekIndex, true);
        if(firstIndex!=-1){
            return firstIndex;
        }
        return findFirstIndex(arr,target,maxPeekIndex+1,arr.length-1,false);
    }

    private static int findFirstIndex(int[] arr, int target, int start, int end, boolean b) {
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if (b) {
                if(target>arr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if(target<arr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    private static int findMaxPeekIndex(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
}
