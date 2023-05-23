package Bitwise_Operators;

/*
 *              1
 *             1 1
 *            1 2 1
 *           1 3 3 1
 *          1 4 6 4 1
 *         1 5 10 10 5 1
 *
 * Find sum of nth row
 *  nC0 + nC1+nC2+...........+nCn =2^n
 * for nth row, sum = 2^(n-1);
 * */
public class SumOfNthRowInPascalTriangle {
    public static void main(String[] args) {
        int row = 4;
        int i = 1 << (row - 1);
        System.out.println(i);
    }
}
