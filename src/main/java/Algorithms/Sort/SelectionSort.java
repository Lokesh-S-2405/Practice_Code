package Algorithms.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={3,4,2,1,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = findMaxindex(arr,  last);
           swapNumber(arr,last, maxIndex);
        }
    }

    private static void swapNumber(int[] arr, int last, int maxIndex) {
        int temp = arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;
    }

    private static int findMaxindex(int[] arr, int last) {
        int max =0;
        for (int i = 0; i <= last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
