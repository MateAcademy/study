package com.klunniy.lambda;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(arr).map(x -> x * 2).forEach(System.out::print);
        System.out.println("\n" + Arrays.toString(arr));
    }
}
