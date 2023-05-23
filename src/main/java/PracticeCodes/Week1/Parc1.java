package PracticeCodes.Week1;

import java.util.Arrays;

public class Parc1 {
    public static void main(String[] args) {
        int arr[] = {3,4,2,1,0};
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length-i-1;
            int start = findMaxIndex(arr, end);
            swapPosition(arr, end, start);
        }
    }

    private static void swapPosition(int[] arr, int end, int start) {
        //Arrays.stream(arr).forEach(System.out::println);
        int temp = arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        //Arrays.stream(arr).forEach(System.out::println);
    }

    private static int findMaxIndex(int[] arr, int end) {
        //int arr1[]={1,0,2};
        int max=0;
        for (int i = 0; i <= end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

}
