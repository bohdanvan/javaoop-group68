package com.bvan.oop.lessons7_8.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        System.out.println(numbers);

        List<String> names = new ArrayList<>();
        names.add("Taras");
        System.out.println(names);
    }
}
