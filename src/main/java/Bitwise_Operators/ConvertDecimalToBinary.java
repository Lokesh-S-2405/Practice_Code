package Bitwise_Operators;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int number = 17;
        String sum ="";
        while(number>0){
            int rem = number % 2;
            sum+=rem;
            number = number / 2;
        }
        for (int i = sum.length()-1; i >=0 ; i--) {
            System.out.print(sum.charAt(i));
        }
    }
}
