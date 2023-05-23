package com.functionalprogramming.functional;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        // Normal Java Functions
        System.out.println(isPhoneNumberValid("07473453534"));

        //Predicate functional programming
        System.out.println(isPhoneNumberValidPredicate.equals("09347534534"));
        // Combination of multiple predicate using and method
        Predicate<String> stringPredicate = isPhoneNumberValidPredicate.and(isPhoneNumberContains3Predicate);
        boolean test = stringPredicate.test("0732212121");
        System.out.println(test);
        System.out.println("===========");
        // Combination of multiple predicate using or method
        Predicate<String> stringPredicateOr = isPhoneNumberValidPredicate.or(isPhoneNumberContains3Predicate);
        boolean testOR = stringPredicateOr.test("0732212121");
        System.out.println(testOR);

    }
    static Boolean isPhoneNumberValid( String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> isPhoneNumberContains3Predicate = phoneNumber -> phoneNumber.contains("3");

}
