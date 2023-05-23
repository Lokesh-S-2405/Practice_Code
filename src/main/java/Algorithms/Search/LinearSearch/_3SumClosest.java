package Algorithms.Search.LinearSearch;

import java.util.Arrays;

/*
* Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
* */
public class _3SumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 0;
        int i = nums.length != 0 ? threeSumClosest(nums, target) : 0;
        System.out.println(i);
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = 0;
        for (int i = 0, minDiff = Integer.MAX_VALUE; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                }
                int diff = Math.abs(target - sum);
                if (diff < minDiff) {
                    minDiff = diff;
                    closest = sum;
                }
            }
        }
        return closest;
    }
}
