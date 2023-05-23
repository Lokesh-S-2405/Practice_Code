package com.functionalprogramming.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // Normal Java function call
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBUrlSupplier.get());
        System.out.println(getStringList.get());
    }
    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBUrlSupplier = () -> "jdbc://localhost:5432/users";


    static Supplier<List<String>> getStringList = () -> {
        ArrayList string= new ArrayList();
        string.add("2345235");
        string.add("Loki");
        return string;
    };
}
