package PracticeCodes;

public class InfinityArray {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long usedMemory = runtime.totalMemory()-runtime.freeMemory();
        System.out.println(usedMemory);
        long maxMemory = runtime.maxMemory();
        System.out.println(maxMemory);
        long availableMemory = maxMemory-usedMemory;
        System.out.println(availableMemory);


int[] arr={1,2,3,11,14,145};
int target=11;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            //end = previous end + sizeofbox*2
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;
        }else if (target>arr[mid]){
            start=mid+1;
        } else{
            return mid;
        }
    }
    return -1;
    }
}
