package Bitwise_Operators;

public class NoOfDigitsInBase {
    public static void main(String[] args) {
        int number =10;
        int base = 16;
        double log = Math.log(10);
        System.out.println(log);
        int ans = (int) (Math.log(number)/Math.log(base))+1;
        System.out.println(ans);
    }
}
