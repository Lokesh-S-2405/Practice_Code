package Bitwise_Operators;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        String number = "21";
        int sum =0;
        int count=0;
        for (int i = number.length()-1; i >=0 ; i--) {
            sum = (int) (sum+(Integer.parseInt(String.valueOf(number.charAt(i))) * Math.pow(8, count++)));
        }
        System.out.println(sum);
    }
}
