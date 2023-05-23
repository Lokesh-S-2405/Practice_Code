package PracticeCodes;

public class PeakIndexMountain {
    public static void main(String[] args) {
        //int arr[]={0,1,0};
        int arr[] = {1,2,3,4,5,2,0};
        System.out.println(binarySearch(arr));
    }

    private static int binarySearch(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            } else {
                start=mid+1;
            }
        }
        return start ;
    }
}
