package com.functionalprogramming.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class _Streams {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("John", Gender.MALE));
        personList.add(new Person("Oliver", Gender.MALE));
        personList.add(new Person("Lisa", Gender.FEMALE));
        personList.add(new Person("Loki", Gender.MALE));
        personList.add(new Person("Loki", Gender.MALE));
        personList.add(new Person("Jaci", Gender.FEMALE));
        personList.add(new Person("Varshi", Gender.FEMALE));
        personList.add(new Person("Albert", Gender.MALE));
        personList.add(new Person("Harshi", Gender.FEMALE));
        System.out.println(personList);
        personList.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);
        //personList.stream().map(person -> person.name).mapToInt(String::length).forEach(System.out::println);
        Map<Gender, Set<String>> collect = personList.stream().collect(groupingBy(Person::getGender, mapping(Person::getName, toSet())));
        collect.entrySet().stream().forEach(System.out::println); // output --> FEMALE=[Varshi, Harshi, Jaci, Lisa] MALE=[Oliver, Loki, John, Albert]
        System.out.println("=====================================");



    }
    static class Person{
        private final String name;
        private final Gender gender;

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

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
