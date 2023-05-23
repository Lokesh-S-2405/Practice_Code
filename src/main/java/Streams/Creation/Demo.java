package Streams.Creation;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Files.*;

public class Demo {
    public static void main(String[] args) throws IOException {

        Optional<Integer> optionalInteger = Stream.of(1, 12, 4, 2, 23).filter(x -> x > 10).findFirst();
        System.out.println(optionalInteger.get());
        List<String> elements =
                Stream.of("a","b","b","c","d","e","c").filter(element -> element.contains("b"))
                        .collect(Collectors.toList());
        Integer integer = Stream.of(2, 43, 12, 213, 4).reduce((a,b)->(a <= b) ? a : b).get();
        System.out.println(integer);
        boolean anyMatch = Stream.of(2, 43, 12, 213, 4).allMatch(x -> x < 45);
        System.out.println(anyMatch);
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();
        System.out.println(anyElement.get() + " "+ firstElement.get());
        Path path = Paths.get("D:\\fileName.txt");
        Stream<String> streamOfStrings = lines(path);
        long count = lines(path).collect(Collectors.toList()).get(0).chars().filter(x -> x == 'o').count();
        //long count = streamOfStrings.toString().chars().filter(x->x=='o').count();
        System.out.println(count);
        Stream<String> streamWithCharset =
                lines(path, Charset.forName("UTF-8"));
        streamWithCharset.forEach(System.out::println);
        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");
        streamOfString.forEach(System.out::print);
        long streamOfChars = "abc asdfs adfsdf adfsfd".chars().filter(x->x==' ').count();
        System.out.println(streamOfChars);
        IntStream.rangeClosed(1,5).forEach(System.out::println);
        OptionalInt reduced =
                IntStream.range(1, 4).reduce((a, b) -> a + b);
        System.out.println(reduced);
        System.out.println("=============================");
        Stream.iterate(20,n->n+2).limit(5).forEach(System.out::println);
        List<String> strings = Arrays.asList("lokesh","is","a","good","boy");
        Stream<String> stream = Stream.empty();
        //System.out.println(streamOf(strings).collect(Collectors.toList()));

        Collection<String> collection = Arrays.asList("a","b","c");
        Stream<String> stringStream = collection.stream();
        //stringStream.forEach(System.out::println);
        String[] arr = new String[]{"a", "b", "c","d"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        //streamOfArrayFull.forEach(System.out::println);
        System.out.println("=======================");
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        ///streamOfArrayPart.forEach(System.out::println);
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("23234").add("b").add("c").build();
        streamBuilder.forEach(System.out::print);
                Stream.generate(() -> "element").limit(10).forEach(System.out::println);

    }
    public static Stream<String> streamOf(List<String> list){
        return list==null || list.isEmpty() ? Stream.empty():list.stream();
    }
}
