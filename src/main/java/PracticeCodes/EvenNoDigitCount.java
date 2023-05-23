package PracticeCodes;

/*Write a program to  find even no of digits in a given array
Example
input = [12,2,5,623,1234]
since 12 and 1234 are even no of digits
Output 2
*/
public class EvenNoDigitCount {
    public static void main(String[] args) {
        int[] arr1={12,3,5,1238163,1234};
        System.out.println(containsEven(arr1));
    }

    private static int containsEven(int[] arr1) {
        int count=0;
        for (int num:arr1){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int noOfEven=noOfEvenDigit(num);
        return noOfEven%2==0;
    }

    private static int noOfEvenDigit(int num) {
        int count=0;
        /*while (num>0){
            count++;
            num=num/10;
        }
        return count;*/
        //Alternate way
        return (int) (Math.log10(num)+1);
    }
}
