package com.klunniy.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {

    public static void main(String[] args) {

        BiFunction<Main4, String, String> toUpperCase = Main4::toUpperCase;
        System.out.println(toUpperCase.apply(new Main4(), "hello"));

//        Function<String, String> function1 = s -> s.toUpperCase();
//        function1.apply("hello");

//        Function<String, String> function2 = Main4::toUpperCase;
//        function2.apply("hello");
//
//        BiFunction<String, String, String> toLoverCase = Main4::toLoverCase;
//        toLoverCase.apply("hello", "love");
    }

    public String toUpperCase(String str) {
        System.out.println(str);
        return str.toUpperCase();
    }

// по логике какой функц интерфейс вот эта штука повторяет:
//    public static String toUpperCase(String str) {
//        System.out.println(str);
//        return str.toUpperCase();
//    }

    public static String toLoverCase(String str, String str2) {
        System.out.println(str + " " + str);
        return str.toLowerCase();
    }
}
