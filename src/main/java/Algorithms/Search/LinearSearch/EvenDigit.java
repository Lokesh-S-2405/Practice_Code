package Algorithms.Search.LinearSearch;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {11, 3422, -212322};
        int evenDigitSum = evenDigitSum(arr);
        System.out.println(evenDigitSum);
        System.out.println(evenDigitSumUsingMathOperator(arr));
        System.out.println((int) Math.log10(341)+1);
    }

    private static int evenDigitSumUsingMathOperator(int[] arr) {
        int count =0 ;
        for (int number :
                arr) {
            if(evenDigitSumMath(number)%2==0){
                count++;
            }
        }
        return count;
        }

    private static int evenDigitSumMath(int number) {
        if(number==0){
            return 1;
        }
        if(number<0){
            number=number*-1;
        }
        return (int) Math.log10(number)+1;
    }

    private static int evenDigitSum(int[] arr) {
        int count = 0;
        for (int number :
                arr) {
            if (even(number))
                count++;
        }
        return count;
    }

    /*converting number to string and finding the length*/
/*    private static boolean even(int number) {
        String string = String.valueOf(number);
        int length = string.length();
        if(length%2==0){
            return true;
        }
        return false;
    }*/
    private static boolean even(int number) {
        if(number==0){
            return true;
        }
        if(number < 0){
            number = number * -1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count % 2 == 0;
    }
    /*private static boolean even(int number) {
        if(number==0){
            return true;
        }
        if(number < 0){
            number = number * -1;
        }
        return Math.log10(number);
    }*/
}