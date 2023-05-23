package PracticeCodes.Week1;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={3,23,12,1};
        insertionSort(arr);
        for (int a:
             arr) {
            System.out.println(a);
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1])
                    swap(arr, j, j - 1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp =arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
