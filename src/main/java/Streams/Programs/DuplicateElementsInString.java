package Streams.Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static Streams.Programs.RepeatedCharInAString.solveUsingLogics;

public class DuplicateElementsInString {
    public static void main(String[] args) {
        String string = "iloveasdfasdfe";
        long count = string.chars().filter(x -> x == 'f').count();
        System.out.println(count);
        DuplicateElementsUsingStreams(string);
       //DuplicateElementsUsingLogics(string);

    }

    private static void DuplicateElementsUsingLogics(String string) {
        HashMap<Character, Integer> entries = solveUsingLogics(string);
        for (Map.Entry<Character, Integer> hashMap:
                entries.entrySet()) {
            if(hashMap.getValue()>1){
                Character key = hashMap.getKey();
                System.out.print(key);
            }
        }
    }

    private static void DuplicateElementsUsingStreams(String string) {
        List<String> collect = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);
    }
}
