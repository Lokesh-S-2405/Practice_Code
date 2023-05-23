package Bitwise_Operators;

/*
* Input 3
* output: 155
* Explaination
1 --> 1 --> 5
2 --> 10 --> 25
3 --> 11 --> 30
* */
public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        usingLogic1(n);
        usingLogic2(n);
    }

    private static void usingLogic2(int n) {
        int ans =0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >>1;
            ans+=last*base;
            base = base* 5;
        }
        System.out.println(ans);
    }

    private static void usingLogic1(int n) {
        for (int i = 1; i <= n; i++) {
            String stringBuilder = convertToBinary(i);
            System.out.print(i+" --> "+stringBuilder + " --> " + convertToDecimal(stringBuilder));
            System.out.println();
        }
    }

    private static int convertToDecimal(String stringBuilder) {
        int count =1;
        int convertToDecimal=0;
        for (int i = stringBuilder.length()-1; i >=0; i--) {
            convertToDecimal = convertToDecimal+(int) (Integer.parseInt(String.valueOf(stringBuilder.charAt(i))) * Math.pow(5, count++));
        }
        return convertToDecimal;
    }

    private static String convertToBinary(int num) {
        String sum ="";
        while (num>0){
            int rem = num % 2;
            sum=sum+(rem);
            num=num/2;
        }
        String reverseNumber="";
        for (int i = sum.length()-1; i >=0; i--) {
            reverseNumber=reverseNumber+(sum.charAt(i));
        }
        return reverseNumber;
    }
}
