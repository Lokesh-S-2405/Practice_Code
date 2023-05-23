package PracticeCodes;

import java.util.Arrays;

public class FirstLastPosElement {
    public static void main(String[] args) {
        int[] nums={7,8,8,9,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    private static int[] searchRange(int[] nums,int target) {
       int[] result={-1,-1};
        result[0] = searchIndexRange(nums,target,true);
       if(result[0] !=-1){
           result[1]=searchIndexRange(nums,target,false);
       }
        return result;
    }

    private static int searchIndexRange(int[] nums,int target,boolean isFound) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target<nums[mid]){
            end=mid-1;
        } else if (target>nums[mid]) {
            start=mid+1;
        }else {
           ans=mid;
           if(isFound){
               end=mid-1;
           }else {
               start=mid+1;
           }
        }
    }
    return ans;
    }
}
