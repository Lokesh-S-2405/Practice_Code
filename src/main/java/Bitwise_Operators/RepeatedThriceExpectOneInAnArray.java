package Bitwise_Operators;

import java.util.HashMap;
import java.util.Map;

public class RepeatedThriceExpectOneInAnArray {
    public static void main(String[] args) {
        int [] arr= {2,2,4,2,7,7,8,7,8,8};
        int sum =0;
        usingBitManipulationMethod(arr, sum);
        usingHashMap(arr);
    }

    private static void usingHashMap(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            } else{
                Integer integer = hashMap.get(arr[i]);
                hashMap.put(arr[i],++integer);
            }
        }
        for (Map.Entry<Integer,Integer> integerEntry:
             hashMap.entrySet()) {
            if(integerEntry.getValue()==1){
                System.out.println(integerEntry.getKey());
            }
        }
    }

    private static void usingBitManipulationMethod(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            sum = sum +convertToBinary(arr[i]);
        }
        StringBuilder s=new StringBuilder();
        String valueOf = String.valueOf(sum);
        for (int i = 0; i < valueOf.length(); i++) {
            s=s.append(valueOf.charAt(i)%3);
        }
        //System.out.println(sum);
        System.out.println(convertBinaryToDecimal(String.valueOf(s)));
    }

    private static int convertBinaryToDecimal(String s) {
        int count =0;
        int sum =0;
        for (int i = s.length()-1; i >=0; i--) {
            sum = sum+((int) (Integer.parseInt(String.valueOf(s.charAt(i)))*Math.pow(2,count++)));
        }
        return sum;
    }


    private static int  convertToBinary(int number) {
        String sum ="";
        String reverseSum="";
        while(number>0){
            int rem = number % 2;
            sum+=rem;
            number = number / 2;
        }
        for (int i = sum.length()-1; i >=0 ; i--) {
            reverseSum+=sum.charAt(i);
        }
        return Integer.parseInt(reverseSum);
    }
}
