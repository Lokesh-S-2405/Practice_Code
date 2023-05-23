package Algorithms.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10,2,4,1,5};
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = i+1; j<arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    isSwapped =true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
