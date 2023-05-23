package PracticeCodes;/*
Ceiling =The smallest element in array greater than or equal to target
 */

public class CelingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 12, 54};
        int target = 11;
        System.out.println(ceilingNumber(arr, target));
    }

    private static int ceilingNumber(int[] arr, int target) {
        if(target> arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if(target>arr[mid]){
                start=mid+1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
