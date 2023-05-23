package PracticeCodes;

public class LongestAndSmallestString {
    public static void main(String[] args) {
        String string = "ifs t am baassd boy";
        String[] strings = string.split(" ");
        String max=strings[0];
        String min=strings[0];
        for (int i = 0; i < strings.length; i++) {
            if(max.length()<strings[i].length()){
                max=strings[i];
            }
            if(min.length()> strings[i].length()){
                min = strings[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
