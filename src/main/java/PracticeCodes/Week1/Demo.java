package PracticeCodes.Week1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[]arr = {2,42,1,4,62,8};
        int target = 2;
        //linearSearch(a, target);
        //bubbleSort(a);
        //insertionSort(a);
        //selectionSort(a);
        //System.out.println(Arrays.toString(mergeSort(arr)));
        //findNoOfBit();

        flipAnImage();
    }

    private static void flipAnImage() {
        int[][] arr = {{1,1,0,1},{1,0,0,1},{1,0,0,0}};
        for (int[] ints : flipAndInvertImage(arr)) {
            System.out.println(Arrays.toString(ints));
        }

    }

    private static int[][] flipAndInvertImage(int[][] arr) {
        for (int[] row:
                arr) {
            for (int i = 0; i < (arr[0].length+1)/2; i++) {
                int temp = row[i]^1;
                row[i]=row[arr[0].length-i-1]^1;
                row[arr[0].length-i-1]=temp;
            }
        }
        return arr;
    }

    private static void findNoOfBit() {
        int a = 3;
        System.out.println(Integer.toBinaryString(a));
        int count =0;
        if(a%2==0){
            System.out.println(1);
        }
        while(a>0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        System.out.println(count);
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {
        int mixedArr[] = new int[left.length+right.length];
        int i =0;
        int j =0;
        int k =0;
        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                mixedArr[k]=left[i];
                i++;
            } else{
                mixedArr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            mixedArr[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            mixedArr[k]=right[j];
            j++;
            k++;
        }
        return mixedArr;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = findMaxindex(arr,last);
            swapPosition(arr,last,maxindex);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swapPosition(int[] arr, int last,int maxindex) {
        int temp=arr[last];
        arr[last]=arr[maxindex];
        arr[maxindex]=temp;
    }

    private static int findMaxindex(int[] arr, int last) {
        int max=0;
        for (int i = 0; i <=last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    private static void insertionSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void swap(int[] a, int j, int i) {
        int temp = a[j];
        a[j]=a[i];
        a[i]=temp;
    }

    private static void bubbleSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i <arr.length; i++) {
            isSwapped=false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void linearSearch(int[] a, int target) {
        int linearSearch = linearSearch(target, a);
        if(linearSearch==-1){
            System.out.println("Not found the target");
        } else {
            System.out.println("Found the target");
        }
    }

    private static int linearSearch(int target,int[] arr) {
        for (int i = 0; i < target; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
