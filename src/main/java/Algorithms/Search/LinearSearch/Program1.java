package Algorithms.Search.LinearSearch;

public class Program1 {
    public static void main(String[] args) {
        int[] arr = {123,45345,1234,35635,23};
        int target = 45345;
        int linearSearch = linearSearch(arr, target);
        if (linearSearch == -1) {
            System.out.println("Element is not found at position");
        } else {
            System.out.println("Element is found at position : " + linearSearch);
        }
    }

    private static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
