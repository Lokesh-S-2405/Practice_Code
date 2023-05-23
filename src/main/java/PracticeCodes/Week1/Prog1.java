package PracticeCodes.Week1;

import java.util.Arrays;

public class Prog1 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,5,5,5,5,5,5,7,8,15,19};
        int target = 5;
        //binarySearch(arr, target);
        //maxPeakInAnArray(arr);
        //Arrays.stream(firstAndLastIndexPositionOfAnArray(arr, target)).forEach(System.out::print);
        infiniteArray(arr,target);
        /*int search = maxPeakInAnArray(arr);
        if(search==-1){
            System.out.println("Target Not Found");
        } else {
            System.out.println("Target is Found at position: "+ search + " Value: "+ arr[search]);
        }*/
    }

    private static void infiniteArray(int[] arr,int target) {
        int start = 0;
        int end = 1;
        if(target>arr[end]){
            int newStart = end+1;
            end = end +(end-start+1)*2;
            start = newStart;
        }

    }

    private static int[] firstAndLastIndexPositionOfAnArray(int[] arr, int target) {
        int firstIndexPosition = firstAndLastIndexPosition(arr, target, true);
        int secondIndexPosition = -1;
        if(firstIndexPosition!=-1){
            secondIndexPosition = firstAndLastIndexPosition(arr, target, false);
        }
        return new int[]{firstIndexPosition,secondIndexPosition};
    }

    private static int firstAndLastIndexPosition(int[] arr, int target,boolean isfirstIndex) {
        int ans = 0;
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]){
                start = mid+1;
            } else{
                ans = mid;
                if(isfirstIndex){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    private static int maxPeakInAnArray(int[] arr) {
        //{2,4,5,6,7,8,15}
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }  else {
                start=mid+1;
            }
        }
        return start;
    }

    private static int binarySearch(int[] arr, int target) {
        //{2,4,5,6,7,8,15}
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end  = mid-1;
            } else if (target> arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
