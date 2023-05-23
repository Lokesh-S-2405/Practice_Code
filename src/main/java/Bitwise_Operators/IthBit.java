package Bitwise_Operators;

public class IthBit {
    public static void main(String[] args) {
        int num =10101010;
        int target = 2;
        int i = 1 << (target - 1);
        System.out.println(num&i);
    }
}
