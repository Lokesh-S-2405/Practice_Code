package PracticeCodes;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayMain {
    public static void main(String[] args) {
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
/*        long startTime=System.currentTimeMillis();*/
        System.out.println(beforeUsedMem);
       /* long endTime=0;*/
        Scanner scan=new Scanner(System.in);
        int[] arr={2,2,1,4,5,7};
        System.out.println(Arrays.toString(swap(arr)));
/*        endTime=System.currentTimeMillis();
        System.out.println("Timetaken to execute the  method"+" : "+(endTime-startTime));*/
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(afterUsedMem);
        System.out.println(afterUsedMem-beforeUsedMem);
    }

    /*private static int[] swap(int[] arr) {
        int[] reverseArr=new int[arr.length];
        int count=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            reverseArr[count]=arr[i];
            count++;
        }
        return reverseArr;
    }
*/

/*     16 milliseconds*/
    private static int[] swap(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
