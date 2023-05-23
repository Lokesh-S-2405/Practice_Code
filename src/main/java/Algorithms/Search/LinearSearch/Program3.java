package Algorithms.Search.LinearSearch;

/*
* Search for element 2 in the range of index [1,4]
* */
public class Program3 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        int target = 2;
        int startIndex = 1;
        int endIndex = 4;
        System.out.println(linearSearchWithIndexRange(arr,target,startIndex, endIndex));
    }

    private static int linearSearchWithIndexRange(int[] arr, int target, int startIndex, int endIndex) {
        if(arr.length==0){
            return -1;
        }
        for (int i = startIndex; i <=endIndex ; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
