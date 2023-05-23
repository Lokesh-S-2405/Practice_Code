package PracticeCodes;

import java.util.HashMap;

public class SmallestWindowthatContainsAllCharactersOfStringItself {
    public static void main(String[] args) {
        String input = "lokilokesh"; //output: ilokesh
        HashMap<Character, Integer> distinctCharacterInAString = findDistinctCharacterInAString(input);
        System.out.println(findSmallestWindow(distinctCharacterInAString.size(),input));
    }

    private static String findSmallestWindow(int size, String input) {
        int dist_cont = size;
        int maxSize = Integer.MAX_VALUE;
        String res = "";
        for (int i = 0; i < input.length(); i++) {
            int count =0;
            int visited[] = new int[256];
            String sub_str = "";
            for (int j = i; j < input.length(); j++) {
                if(visited[input.charAt(j)]==0){
                    count++;
                    visited[input.charAt(j)]=1;
                }
                sub_str+=input.charAt(j);
                if(count==dist_cont)
                    break;
            }
            if(sub_str.length()<maxSize && count == dist_cont){
                res=sub_str;
                maxSize=res.length();
            }
        }
        return res;
    }

    private static HashMap<Character,Integer> findDistinctCharacterInAString(String input) {
        HashMap<Character, Integer> map= new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))){
                Integer integer = map.get(input.charAt(i));
                map.put(input.charAt(i),++integer);
            } else {
                map.put(input.charAt(i),1);
            }
        }
        return map;
    }
}
