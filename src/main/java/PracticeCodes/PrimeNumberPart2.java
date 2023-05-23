package PracticeCodes;

public class PrimeNumberPart2 {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n + 1];
        isPrimeNumber(prime, n);
    }

    //O(N*log(logN)) Time complexity
    private static void isPrimeNumber(boolean[] prime, int n) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
    }
}

