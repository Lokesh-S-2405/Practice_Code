package com.functionalprogramming.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer=new Customer("LOKI","9874561238");
        // Normal Java Function
        greetCustomer(customer);
        //Consumer Functional Programming
        greetCustomerConsumer.accept(customer);
        //BiConsumer Functional Programming
        greetCustomerConsumerv2.accept(customer,true);

    }

    static Consumer<Customer> greetCustomerConsumer= customer ->
            System.out.println("Hello " + customer.customerName +
                    ", Thanks for registering phone number "
                    + customer.customerNumber);

    static BiConsumer<Customer,Boolean> greetCustomerConsumerv2= (customer,showNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", Thanks for registering phone number "
                    + (showNumber?customer.customerNumber : "**********"));
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                            ", Thanks for registering phone number "
                            + customer.customerNumber);
    }
    static class Customer{
        private final String customerName;
        private final String customerNumber;

        public Customer(String customerName, String customerNumber) {
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerNumber='" + customerNumber + '\'' +
                    '}';
        }
    }
}
