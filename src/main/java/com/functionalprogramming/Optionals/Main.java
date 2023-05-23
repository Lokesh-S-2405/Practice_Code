package com.functionalprogramming.Optionals;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Object get = Optional.ofNullable(null).orElseGet(() -> "default value");
        Object get = Optional.ofNullable("hello").orElse(" ");
        if(get instanceof Long){
            System.out.println("yes its an object");
        } else {
            System.out.println("no");
        }
        //Object get = Optional.ofNullable(null).orElseThrow(()->new RuntimeException("Exception occured"));
        Optional.ofNullable("loki@yopmail.com").ifPresent(email-> System.out.println("Sending an email to "+ email));
        /*Optional.ofNullable("test@yopmail.com")*/
        System.out.println(get);
    }
}
