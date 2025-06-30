package com.klunniy.lambda.Boglan;


import java.util.concurrent.Flow;
import java.util.function.Consumer;



public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Test<Main, String, Integer, String> tuUpperCase = Main::tuUpperCase;
        Test<Main, String, Integer, String> tuUpperCase2 = (m, str, a) -> str.toUpperCase().repeat(a);

        System.out.println(tuUpperCase.apply(main, "hello ", 2));
        System.out.println(tuUpperCase2.apply(main, "hello ", 4));
    }

    public String tuUpperCase(String str, Integer a) {
        return str.toUpperCase().repeat(a);
    }



}

@FunctionalInterface
interface Test<T, P, K, R> {
    R apply(T t, P p, K k);
}