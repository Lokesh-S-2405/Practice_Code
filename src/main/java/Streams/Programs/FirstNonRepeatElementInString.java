package Streams.Programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElementInString {
    public static void main(String[] args) {
        String string = "ilovejavasi";
        FirstNonRepeatElementUsingStream(string);
    }

    private static void FirstNonRepeatElementUsingStream(String string) {
        //In below logic we are using linkedHashMap::new to preserve the insertion order... if we don't use LinkedHashMap by default HashMap is used(which do not preserve the order)
        String key = Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);
    }
}
