package com.functionalprogramming.callBackFunction;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        hello("loki", null, value -> {
            System.out.println("no lastname provided for " + value);
        });
        System.out.println("===============================");
        hellov2("loki", null, () -> "no lastname provided");

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hellov2(String firstName, String lastName, Supplier<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            System.out.println(callback.get());
        }
    }

}
