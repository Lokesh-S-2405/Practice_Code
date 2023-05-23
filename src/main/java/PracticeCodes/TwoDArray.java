package PracticeCodes;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][] ={
                {2,3,45},
                {5,2,12},
                {134,1234,32}
        };
        int target=134;
        System.out.println(Arrays.toString(twoDArrays(arr, target)));
    }

    private static int[] twoDArrays(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
