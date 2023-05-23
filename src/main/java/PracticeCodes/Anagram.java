package PracticeCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "madae";
        String string2 = "madama";
        Stack stack = new Stack();
        char[] chars = string1.toCharArray();
        for (int i = 0; i < string1.length(); i++) {
            stack.push(string1.charAt(i));
        }
        String s="";
        while (!stack.isEmpty()){
             s= s+stack.pop();
        }
        System.out.println(s);
       // System.out.println(isAnagram(string1, string2));

    }
    private static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;
        if(countNumberOfCharacter(string1).equals(countNumberOfCharacter(string2))){
            return true;
        }
        return false;
    }

    private static HashMap<Character, Integer> countNumberOfCharacter(String string1) {
        HashMap<Character, Integer> stringIntegerHashMap = new HashMap<>();
        for (char s :
                string1.toCharArray()) {
            if (stringIntegerHashMap.isEmpty() || !stringIntegerHashMap.containsKey(s)) {
                stringIntegerHashMap.put(s, 1);
            } else {
                int var = stringIntegerHashMap.get(s);
                stringIntegerHashMap.put(s, ++var);
            }
        }
        return stringIntegerHashMap;
    }
}

