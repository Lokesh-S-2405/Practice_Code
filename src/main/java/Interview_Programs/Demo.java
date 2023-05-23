package Interview_Programs;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int arr[] = {8,6,23,1};
        //86321 largets value
        System.out.println(maxmiumValue(arr));
    }

    private static String maxmiumValue(int[] arr) {
       String s ="";
        for (int i = 0; i < arr.length; i++) {
            int size = findNumberOfDigitInAnArray(arr[i]);
            if(size<1){
                s = s+arr[i];
            } else {
                int swapDigits = swapDigits(arr[i]);
                s=s+swapDigits;
            }
        }
        return s;
    }

    private static int swapDigits(int nums) {
        int sum =0;
        while(nums>0){
            int rem = nums%10;
            sum = sum*10 + rem;
            nums = nums/10;
        }
        return sum;
    }

    private static int findNumberOfDigitInAnArray(int n) {
        int sum = 0;  //23
        while(n>0){
            n = n%10;
            n=n/10;
            sum++;
        }
        return sum;
    }
}
