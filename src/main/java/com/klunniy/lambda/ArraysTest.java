package com.klunniy.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.set(0, 5);
        System.out.println(list);

//        List<Integer> list2 = List.of(1, 2, 3);
//        list2.set(0, 5);
//        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        list3.add(4);
        System.out.println(list3);

//        List<Integer> list4 = new ArrayList<>(1, 2, 3);

        List<Integer> list5 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
        System.out.println(list5);
    }
}
