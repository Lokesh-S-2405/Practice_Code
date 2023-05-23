package Algorithms.Search.LinearSearch;

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 4},
                {3, 4, 21}, {10, 32, 12}};
        int target = 21;
        Arrays.stream(linearSearchTwoDArray(arr, target)).forEach(System.out::println);
        System.out.println(maxElementinTwoDArray(arr));

    }

    private static int maxElementinTwoDArray(int[][] arr) {
        int max = arr[0][0];
        for (int[]  arr1:
             arr) {
            for (int ar:
                 arr1) {
                if(ar>max){
                    max=ar;
                }
            }

        }
        return max;
    }

    private static int[] linearSearchTwoDArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
