package com.functionalprogramming.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Supplier<List<Person>> getUserListData = ()->{
            List<Person> personList=new ArrayList<>();
            personList.add(new Person("John",Gender.MALE));
            personList.add(new Person("Oliver",Gender.MALE));
            personList.add(new Person("Lisa",Gender.FEMALE));
            personList.add(new Person("Loki",Gender.MALE));
            personList.add(new Person("Jaci",Gender.FEMALE));
            personList.add(new Person("Varshi",Gender.FEMALE));
            personList.add(new Person("Albert",Gender.MALE));
            personList.add(new Person("Harshi",Gender.FEMALE));
            return null;
        };
        List<Person> personList = Optional.ofNullable(getUserListData.get()).orElse(new ArrayList<>());
        System.out.println(personList);

        //Declarative approach
        List<Person> female = personList.stream().filter(x->x.gender.equals(Gender.FEMALE)).collect(Collectors.toList());
        female.stream().forEach(System.out::println);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
