package com.klunniy.lambda.Boglan;

import lombok.Data;

import java.util.function.BiConsumer;


public class Main2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        BiConsumer<Person, Integer> setAge = Person::setAge;

        businessLogic(setAge, person1, 12);
        businessLogic(setAge, person2, 18);

        System.out.println(person1);
        System.out.println(person2);
    }

    public static void businessLogic(BiConsumer<Person, Integer> consumer, Person p, int age) {
        consumer.accept(p, age);
    }
}

@Data
class Person {
    int age;
}
