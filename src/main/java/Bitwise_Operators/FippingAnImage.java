package Bitwise_Operators;

import java.util.Arrays;

/*
* Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*
* */
public class FippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        for (int[] ints : flipAndInvertImage(arr)) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static int[][] flipAndInvertImage(int[][] arr) {
        for (int[] row:
                arr) {
            for (int i = 0; i < (arr[0].length+1)/2; i++) {
                int temp = row[i]^1;
                row[i]=row[arr[0].length-i-1]^1;
                row[arr[0].length-i-1]=temp;
            }
        }
        return arr;
    }
}
