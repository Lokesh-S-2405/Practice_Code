package PracticeCodes;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        //int[] arr = {4,3,4,3,1,2}; //output: 124343;
        int[] arr = {3,2,1,6}; // output: 6321
        int initialValue = arr[0];
        for (int i = 0; i < initialValue; i++) {
            arr = rotateAnArray(arr);
        }
        String string = "";
        for (int i = 0; i < arr.length; i++) {
            string=string+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(string);
    }

    private static int[] rotateAnArray(int[] arr) {
        int temp =arr[0];
        for (int j = 0; j < arr.length-1; j++) {
            arr[j]=arr[j+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
}
