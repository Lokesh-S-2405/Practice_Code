package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
*
* */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,2,1}; //output: 1
       // System.out.println(singleNumberApproach1(nums));
        System.out.println(singleNumberApproach2(nums));

    }

    private static int singleNumberApproach2(int[] nums) {
        /*
        Note:
        array,every element appears twice except for one.
        If array contains duplicate element then it cancels each other.
        2 XOR 0 ->2
        * XOR operator
        * 0 0 -> 0
        * 0 1 -> 1
        * 1 0 -> 1
        * 1 1 -> 0
        * */
        int ans =0;
        for (int i = 0; i < nums.length; i++) {
            ans^=nums[i];
        }
        return ans;
    }

    public static int singleNumberApproach1(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],1);
            } else{
                Integer integer = hashMap.get(nums[i]);
                hashMap.put(nums[i],++integer);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();

        for (Map.Entry<Integer, Integer> integer:
                entries) {
            if(integer.getValue()==1){
                return integer.getKey();
            }
        }

        return -1;
    }
}
