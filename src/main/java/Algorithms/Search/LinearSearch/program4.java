package Algorithms.Search.LinearSearch;

public class program4 {
    public static void main(String[] args) {
        int[] arr = {1,12,4,3,5,6};
        System.out.println(arr.length-1);
        System.out.println(maxElement(arr));
        System.out.println(minElement(arr));
    }

    private static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    private static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min =arr[i];
            }
        }
        return min;
    }
}
