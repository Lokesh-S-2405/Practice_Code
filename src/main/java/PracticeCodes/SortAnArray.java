package PracticeCodes;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2,3,4, 3,5, 2, 1};
        bubbleSort(arr);

        int[] sortedArr = new int[arr.length];
        int[] newArr = new int[arr.length];
        int k = 0;
        int m = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                sortedArr[k++] = arr[i];
            } else {
                newArr[m] = arr[i];
                m++;
            }
        }
        for (int i = k; i < arr.length; i++) {
            sortedArr[i] = newArr[j++];
        }
        System.out.println(Arrays.toString(sortedArr));
    }
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
