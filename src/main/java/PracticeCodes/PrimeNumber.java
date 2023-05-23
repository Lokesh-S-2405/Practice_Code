package PracticeCodes;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" "+isPrimePart1(i));
            //System.out.println(i+" "+isPrimePart2(i));
        }

    }

    private static boolean isPrimePart2(int i) {
        if (i<=1){
            return false;
        }
        int c=2;
        while(c*c<=i){
         if(i%c==0){
             return false;
         }
         c++;
        }
        return true;
    }


    private static boolean isPrimePart1(int n) {
        if(n<=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n %i==0){
                return false;
            }
        }
        return true;
    }
}
