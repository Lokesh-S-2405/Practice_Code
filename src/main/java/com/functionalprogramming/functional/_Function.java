package com.functionalprogramming.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
/*        long start = System.currentTimeMillis();
        System.out.println(start);
        int increment = increment(0);
        System.out.println(increment);
        long end = System.currentTimeMillis();
        System.out.println("Normal approach : "+ (end-start)+"ms");
        System.out.println("======================================================================");
        long startFunctionalProgrammingTime = System.currentTimeMillis();
        System.out.println(startFunctionalProgrammingTime);*/
        Function<Integer, Integer> incrementByOneFunction = number -> number+1;
//        Integer apply = incrementByOneFunction.apply(1);
//        System.out.println(apply);
        long endFunctionalProgrammingTime = System.currentTimeMillis();
        //System.out.println("Functional approach : "+(endFunctionalProgrammingTime-startFunctionalProgrammingTime)+"ms");
        Function<Integer, Integer> multipleBy10 = number -> number*10;

/*        int multiply= multipleBy10.apply(1);
        System.out.println(multiply);*/

        Function<Integer, Integer> addByOneAndThenMultipleByOne = incrementByOneFunction.andThen(multipleBy10);
        Integer result = addByOneAndThenMultipleByOne.apply(3);
        System.out.println(result);
        System.out.println(incrementByOneFunction.apply(2));
        BiFunction<Integer,Integer,Integer> biFunction = (number1,number2) -> number1*number2;
        System.out.println(biFunction.apply(4,50));

    }
    //imperative approach
    static int increment(int number){
        return number+1;
    }

}
