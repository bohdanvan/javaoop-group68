package com.bvan.oop.lessons9_10.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @author bvanchuhov
 */
public class StreamExample {

    public static void main(String[] args) {
        // Stream API

        List<Integer> list = Arrays.asList(10, 30, 20, 40);

        for (Integer elem : list) {
            if (elem < 35) {
                elem = elem * 2;
                System.out.println(elem);
            }
        }
        System.out.println();

        // Functional

        List<Integer> res = list.stream()
                .filter(e1 -> e1 < 35)
                .map(e -> e * 2)
                .collect(Collectors.toList());

        res.forEach(e -> System.out.println(e));

        BinaryOperator<Integer> x = (acc, e) -> acc + e;
        Integer sum = res.stream()
                .reduce(0, x);

        System.out.println("sum = " + sum);
    }
}
