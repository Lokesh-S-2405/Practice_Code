package Algorithms.Search.LinearSearch;

public class Program2 {
    public static void main(String[] args) {
        String string = "lokesh";
        char c = 'o';
        System.out.println(linearSearchString(string,c));
        System.out.println(linearSearchString2(null,'e'));
    }

    private static int linearSearchString2(String string, char c) {
        if(string == null || string.isEmpty())
            return -1;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }

    private static int linearSearchString(String string, char c) {
        char[] stringToChar = string.toCharArray();
        for (char i = 0; i < stringToChar.length; i++) {
            if(stringToChar[i]==c){
                return i;
            }
        }
        return -1;
    }
}
