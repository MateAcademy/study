package com.klunniy.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        Consumer<String> consumer = Test::print;
        consumer.accept("hello");

        List<String> list = Arrays.asList("hello", "world");
        list.forEach(System.out::println);
        list.forEach(Test::print);


        Test test = new Test();
        BiFunction<Test, String, String> toUpperCase = Test::toUpperCase;
        System.out.println(toUpperCase.apply(test, "hello"));

        Test test2 = new Test();
        Function<String, String> toUpperCase2 = test2::toUpperCase;
        System.out.println(toUpperCase2.apply("hello"));
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
