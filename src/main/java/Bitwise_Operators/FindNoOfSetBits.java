package Bitwise_Operators;

public class FindNoOfSetBits {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(Integer.toBinaryString(16));
        int count = 0;
        while (num>0){
            if((num & 1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);
    }
}
