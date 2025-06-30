package com.klunniy.lambda.lesson2;

import com.klunniy.lambda.lesson11.Person;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

        Function<Integer, String> function = x -> "Hello" + x;
        System.out.println(function.apply(1));


        Predicate<String> predicate = x -> x.equals("Hello");
        System.out.println(predicate.test("hello"));

        LongUnaryOperator longUnaryOperator = new LongUnaryOperator() {
            @Override
            public long applyAsLong(long operand) {
                return operand * 2;
            }
        };      //    x -> x * 2;
        System.out.println(longUnaryOperator.applyAsLong(2));
    }


    private void doSomething(Integer age) {
        // ...
    }
}
