package PracticeCodes;

import java.util.Arrays;

public class MaxMinWealth {
    public static void main(String[] args) {
        int[][] accounts ={{1,2,3},{3,2,1},{8,2,4}};
        System.out.println(maxMinWealth(accounts));
    }
    static int maxMinWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        System.out.println(ans);
        for (int[] ints : accounts) {
            System.out.println(Arrays.toString(ints));
            int sum = 0;
            for (int anInt : ints) {
                System.out.println(anInt);
                sum +=anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
