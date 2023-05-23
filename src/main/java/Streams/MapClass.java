package Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapClass {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "Java");
        /*Split a word to character and combine to single List */
        splitWordsToCharAndJoin(words);
        /*Duplicate Characters count in a given List<String>*/
        duplicateCharInListOfString(words);

        /*Flap Map Example Using An Array*/
        flatMapExampleUsingAnArray();

    }

    private static void flatMapExampleUsingAnArray() {
        List<List<Integer>> integers = Arrays.asList(
                Arrays.asList(1,2,13,5),
                Arrays.asList(0,12,4,3),
                Arrays.asList(100,200,11,22)
                );
        List<Integer> integerList = integers.stream().flatMap(i->i.stream().map(x->x*2)).collect(Collectors.toList());
        integerList.forEach(x->{
           getDisplay(x);
        });
    }

    private static void duplicateCharInListOfString(List<String> words) {
        LinkedHashMap<String, Long> collect = words.stream().flatMap(word -> Arrays.stream(word.split(""))).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.entrySet().forEach(System.out::println);
    }

    private static void splitWordsToCharAndJoin(List<String> words) {
        List<String> characters = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.toList());
        System.out.println(characters);
    }

    public static void getDisplay(Integer integer){
        System.out.print(integer+" ");
    }
}
