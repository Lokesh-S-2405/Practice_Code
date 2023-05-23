package PracticeCodes.Week1;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,10};
        int target = 10;
        if(target<arr[arr.length-1]){
            int celingOfANumber = celingOfANumber(arr, target);
            System.out.println(celingOfANumber);
        } else {
            System.out.println("Target is greater than the array elements");
        }

    }

    private static int celingOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return start;
    }
}
