package Algorithms.Sort;

import java.util.Arrays;

/*
* [5,3,4,1,2]
* After first pass: i=0 , j=1 , [3,5,4,1,2]
* After second pass: i=1 , j=2 ,[3,4,5,1,2]
* After third pass:  i=2 , j=3 ,[1,3,4,5,2]
*
* */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
