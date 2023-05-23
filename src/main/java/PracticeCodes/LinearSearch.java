package PracticeCodes;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {93, 25, 36, -232, 23, 54, 64};
        String name=null;
        char c='m';
        int target = 23;
        //System.out.println(linearSearch(arr, target));
        if(name!=null) {
            System.out.println(linearSearchString(name, c));
        }
        System.out.println("Enter valid string");
        System.out.println(minElementInArray(arr));
    }

    private static int minElementInArray(int[] arr) {

        if(arr.length!=0){
            int min=arr[0];
            for (int arr1:arr){
                if(arr1<min){
                    min=arr1;
                }
            }
            return min;
        }else {
            return -1;
        }
    }

    private static int linearSearchString(String name, char c) {
        if(name.isEmpty()){
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] arr, int target) {
        /*for (int arr1:arr){
            if(arr1==target){
                return "found";
            }
        }
        return "Not found";
    }*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
