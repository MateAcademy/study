package com.klunniy.lambda.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>() {{
            add(new Person("Serhii", 10, "Kiev", "manager"));
            add(new Person("Anna", 20, "Kiev", "qa"));
            add(new Person("Max", 30, "Lviv", "developer"));
        }};

        Map<String, List<Person>> groupPersonsByCity = persons.stream()
            .distinct()
            .collect(Collectors.groupingBy(Person::getCity));


        groupPersonsByCity.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        persons.forEach(System.out::println);

        //System.out.println(groupPersonsByCity);


//        int[] numbers = {2, 6, 4};
//        int min = Arrays.stream(numbers).min().getAsInt();
//        System.out.println(min);
//
//        int max = Arrays.stream(numbers).max().getAsInt();
//        System.out.println(max);
//
//        double ser = Arrays.stream(numbers).average().getAsDouble();
//        System.out.println((int)ser);

//        System.out.println(Arrays.stream(numbers).min().getAsInt());
    }
}
