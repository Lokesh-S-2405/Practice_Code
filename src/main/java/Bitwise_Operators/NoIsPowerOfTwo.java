package Bitwise_Operators;

/*
* Only one should be there
* example
* 10000--->power of two
* 10100-->not a power of two
* 000
* 001
* 010
* 011
* 100
* 101
* */
public class NoIsPowerOfTwo {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Integer.toBinaryString(5-1));
        boolean ans = (n & (n-1))==0;
        System.out.println(ans);
    }
}
