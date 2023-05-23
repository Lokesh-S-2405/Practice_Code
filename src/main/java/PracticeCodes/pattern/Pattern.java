package PracticeCodes.pattern;

/*
[1, 3, 5]
[3, 5, 1]
[5, 1, 3]
*/
import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
        int[] arr={1,3,5};
        for (int i = 1; i <=arr.length ; i++) {
            singleValue(arr);
            shiftArray(arr);
        }
    }

    private static void singleValue(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum*10+arr[i];
        }
        System.out.println(sum);
    }

    private static void shiftArray(int[] arr) {
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
