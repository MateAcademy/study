package com.klunniy.reduse;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.stream(arr).reduce((x, y) -> x + y).getAsInt());
    }
}
