package PracticeCodes;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] chars = {'c', 'f', 'j'};

        char target = 'c';
        System.out.println(1%3);//1
        System.out.println(1/3);//0
        System.out.println(smallestLetterGreaterThanTarget(chars, target));
    }

    private static char smallestLetterGreaterThanTarget(char[] chars, char target) {
       /* if (target > chars[chars.length - 1]) {
            return chars[0];
        }*/
        int start = 0;
        int end = chars.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < chars[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
            System.out.println(start% chars.length);
        }
        return chars[start% chars.length];
    }
}
