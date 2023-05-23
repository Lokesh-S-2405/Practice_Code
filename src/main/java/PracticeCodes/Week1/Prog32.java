package PracticeCodes.Week1;

import java.util.Arrays;

public class Prog32 {
    public static void main(String[] args) {
        // findPowerOfTwo();
        //convertBinaryToDecimal();
        //convertDecimaltoBinanary();
        //binarySearch();
        rotateArrayBasedOnKthElement();

    }

    private static void rotateArrayBasedOnKthElement() {
        int[] input = {3,4,2,5,2};
        int target = input[0];
        for (int i = 0; i < target; i++) {
            rotateAnArray(input);
            Arrays.stream(input).forEach(System.out::print);
            System.out.println();
        }

    }

    private static void rotateAnArray(int[] input) {
        int start = input[0];
        for (int i = 1; i < input.length; i++) {
            input[i-1]=input[i];
        }
        input[input.length-1]=start;
    }

    private static int binarySearch() {
        int[] input = {2,5,6,8,9,10};
        int target =  6;
        int start = 0;
        int end = input.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>input[mid]){
                start = mid+1;
            } else if (target<input[mid]) {
                end = mid-1;
            } else if (target==input[mid]){
               return mid;
            }
        }
        return -1;
    }

    private static void convertDecimaltoBinanary() {
        int input=35;
        String string="";
        while (input>0){
            int rem=input%2;
            string=string+rem;
            input=input/2;
        }
        for (int i = string.length()-1; i >=0 ; i--) {
            System.out.print(string.charAt(i));
        }
    }

    private static void convertBinaryToDecimal() {
        int input = 111010;  //2+8+16+32
        String valueOf = String.valueOf(input);
        int sum =0;
        int count=0;
        for (int i = valueOf.length()-1; i >=0 ; i--) {
            sum = (int) (sum+(Integer.parseInt(String.valueOf(valueOf.charAt(i)))*Math.pow(2,count++)));
        }
        System.out.println(sum);
    }

    private static void findPowerOfTwo() {
        int base =2 ;
        int power = 5;
        int sum =1;
        while(power>0){
            if((power&1)==1){
                sum*=base;
            }
            base=base*base;
            power=power>>1;
        }
        System.out.println(sum);
    }
}
