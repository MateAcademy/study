package com.klunniy.lambda;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        var list = Utility.wrapList(List.of("12", 100, new IllegalAccessError("here is an error")), v -> v);
        System.out.println(list);


        var list2 = Utility.wrapList(List.of("12", 100, new IllegalAccessError("here is an error")), UnaryOperator.identity());
        System.out.println(list2);
    }

//        Function<Integer, Integer> f = x -> x * 2;
//        System.out.println(f.apply(1));
//
//        Function<String, String> func = Utility::toUpperCase;
//        System.out.println(func.apply("hello"));

//        BiFunction<String, Integer, String> func2 = Utility::toUpperCase2;
//        System.out.println(func2.apply("hello ", 5));

//        var list = Utility.wrapList(List.of("12", 100, new IllegalAccessError("here is an error")), v-> v);
//        System.out.println(list);

//        System.out.println("hello ".repeat(2));
//
//           Utility utility = new Utility();
//        Function<String, String> func2 = utility::toUpperCase2;
//        System.out.println(func2.apply("hello"));

//        BiFunction<Utility, String, String> utilityStringStringBiFunction = Utility::toUpperCase2;
//        System.out.println(utilityStringStringBiFunction.apply(utility, "hello"));
//    }
//}

    class Utility {

        public static <T> List<T> wrapList(List<T> values, UnaryOperator<T> operator) {
            return values.stream().map(operator).collect(Collectors.toList());
        }
    }

}

//    public static String toUpperCase(String str) {
//        return str.toUpperCase().repeat(1);
//    }
//
//    public static String toUpperCase2(String str, Integer repeat) {
//        return str.toUpperCase().repeat(repeat);
//    }


//    public String toUpperCase2(String str) {
//        return str.toUpperCase().repeat(2);
//    }


