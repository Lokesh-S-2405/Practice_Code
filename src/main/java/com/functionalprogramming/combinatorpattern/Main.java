package com.functionalprogramming.combinatorpattern;

import java.time.LocalDate;
import static com.functionalprogramming.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer= new Customer("Loki",
                "loki@yopmail.com",
                "+874561237",
                LocalDate.of(1998,5,24));
        CustomerValidatorService customerValidatorService= new CustomerValidatorService();
        boolean valid = customerValidatorService.isValid(customer);
        //System.out.println(valid);

        //Using Combinator pattern
/*        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdultValid())
                .apply(customer);*/
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdultValid()).apply(customer);
        System.out.println(result);
        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
