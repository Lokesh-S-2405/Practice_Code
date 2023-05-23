package PracticeCodes;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char ch[] ={'c','g','j'};
        char target = 'j';
        char nextGreatestLetter = nextGreatestLetter(ch, target);
        System.out.println(nextGreatestLetter);

    }

    private static char nextGreatestLetter(char[] ch, char target) {
        int start = 0;
        int end = ch.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<ch[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ch[start % ch.length];
    }
}
