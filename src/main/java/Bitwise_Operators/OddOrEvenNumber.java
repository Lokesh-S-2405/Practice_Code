package Bitwise_Operators;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        int num = 41;
        System.out.println(usingOperators(num));
        System.out.println(usingNormalLogic(num));

    }

    private static boolean usingNormalLogic(int num) {
        return num % 2 == 0;
    }

    private static boolean usingOperators(int num) {
        return (num & 1) == 0;
    }
}
