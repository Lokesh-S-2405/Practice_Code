package PracticeCodes;

import java.util.Scanner;

public class PracticeCode {
    public static void main(String[] args) {
        int[] arr={2,4,5,11,15,17};
        int target = 10;
        int ceilOfAnArray = ceilOfAnArray(arr, target);
        System.out.println(ceilOfAnArray);

    }

    private static int ceilOfAnArray(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]){
                end = mid-1;
            } else {
                return mid;
            }
        }
        return end;
    }

    /*private static void recursionNumber(int input) {
        if(input==1){
            
        }

    }*/


}
