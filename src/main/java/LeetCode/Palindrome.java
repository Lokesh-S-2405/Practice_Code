package LeetCode;

public class Palindrome {
    public static void main(String[] args) {
        int x = 21212;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        }

        return true;
    }
}
