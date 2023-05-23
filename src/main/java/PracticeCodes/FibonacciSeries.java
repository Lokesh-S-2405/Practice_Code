package PracticeCodes;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=5;
        usingRecursion(n);
        System.out.println();
        usingNormalLogic(n);

    }

    private static void usingNormalLogic(int n) {
        int firstNumber = 0;
        int secondNumber= 1;
        for (int i = 0; i < n; i++) {
            System.out.print(firstNumber + " ");
            int nextNumer = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumer;
        }
    }

    private static void usingRecursion(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries(i)+ " ");
        }
    }

    public static int fibonacciSeries(int n) {
        if(n<=1){
            return n;
        }
        int i = fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        return i; //consider 1+
    }
}
