package Streams.Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {5,78,3,600,12,73};

        int logics = SecondLargestElementInArrayUsingLogics(numbers);
        System.out.println(logics);

        //Using Streams Approach one
        List<Integer> collect = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
        System.out.println(collect.get(collect.size()-2));
        // Approach two
        Integer integer = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);

    }

    private static int SecondLargestElementInArrayUsingLogics(int[] numbers) {
        int[] arr = sortedAnArray(numbers);
        return arr[1];
        /*Arrays.stream(arr).forEach(System.out::println);
        //int target = findMaxElementInAnArray(numbers);
        int target = arr[0];
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target< arr[mid]){
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return end;*/
    }

    private static int[] sortedAnArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]<numbers[j]){
                    int temp = numbers[j];
                    numbers[j]= numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        return numbers;
    }

    private static int findMaxElementInAnArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }
}
