package PracticeCodes;

import java.util.LinkedHashMap;

public class DuplicateWordsInAString {
    public static void main(String[] args) {
        String string = "Bad boy bad boy bad eat";
        String toLowerCase = string.toLowerCase();
        String word[] = toLowerCase.split(" ");
        LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < word.length; i++) {
            if (!hashMap.containsKey(word[i])) {
                hashMap.put(word[i], 1);
            } else {
                Integer integer = hashMap.get(word[i]);
                hashMap.put(word[i], ++integer);
            }
        }
        hashMap.entrySet().forEach(System.out::println);
    }
}
