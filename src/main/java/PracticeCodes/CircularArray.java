package PracticeCodes;

import java.util.Arrays;

public class CircularArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int start = arr[0];
        for (int i = 0; i <arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=start;
        Arrays.stream(arr).forEach(System.out::println);
    }
}
