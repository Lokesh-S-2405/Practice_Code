package Streams.Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharInAString {
    public static void main(String[] args) {
        String string = "aaaefxsefasass";
        HashMap<Character, Integer> hashMap = solveUsingLogics(string);
        //solveUsingStreams(string);
        hashMap.entrySet().forEach(System.out::print);
    }

    static HashMap<Character, Integer> solveUsingLogics(String string) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(!hashMap.containsKey(c)){
                hashMap.put(c,1);
            } else {
                Integer integer = hashMap.get(c);
                hashMap.put(c,++integer);
            }
        }
        return hashMap;
    }

    private static void solveUsingStreams(String string) {
        Map<String,Long> map = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}