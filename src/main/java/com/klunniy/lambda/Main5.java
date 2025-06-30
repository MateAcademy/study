package com.klunniy.lambda;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.function.Consumer;

public class Main5 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(5);
//        Consumer<Integer> setAge = person::setAge;
//        businessLogic(setAge);

        Consumer<Integer> setAge2 = x -> System.out.println(x + 10);
        businessLogic(setAge2);

//        System.out.println(person);
    }

    private static String businessLogic(Consumer<Integer> setAge) {
        setAge.accept(25);
        return "test";
    }
}

@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
class Person {
    String name;
    @Setter
    Integer age;
}