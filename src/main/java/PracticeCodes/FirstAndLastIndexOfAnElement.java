package PracticeCodes;

import java.util.Arrays;

public class FirstAndLastIndexOfAnElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2, 3};
        int target = 2;
        Arrays.stream(binarySearch(arr, target)).forEach(System.out::print);
        /*int[] iterateFromBothEnd = iterateFromBothEnd(arr, target);
        Arrays.stream(iterateFromBothEnd).forEach(System.out::println);*/
    }

    private static int[] iterateFromBothEnd(int[] arr, int target) {
        int endIndex = loopFromEnd(arr, target);
        int startIndex = loopFromStart(arr, target);
        return new int[]{startIndex, endIndex};
    }

    private static int loopFromStart(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int loopFromEnd(int[] arr, int target) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    private static int[] binarySearch(int[] arr, int target) {
        int ans[] ={-1,-1};
        ans[0] = search(arr,target,true);
        if(ans[0]!=-1){
            ans[1] = search(arr,target,false);
        }
        return ans;
    }
    static int search(int[] arr, int target, boolean firstStartIndex){
        int ans = -1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            } else {
                ans = mid;
                if(firstStartIndex){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}


