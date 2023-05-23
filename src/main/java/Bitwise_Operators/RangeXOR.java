package Bitwise_Operators;

public class RangeXOR {
    public static void main(String[] args) {
        int a =3;
        int b= 9;
        onlyForChecking(a, b);
        System.out.println("=====================");
        int ans= xorNumber(b)^xorNumber(a-1);
        System.out.print(ans);
    }

    private static void onlyForChecking(int a, int b) {
        int ans = 0;
        for (int i = a; i <= b; i++) {
            ans^=i;
        }
        System.out.println(ans);
    }

    public static int xorNumber(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
       return 0;
    }
}
