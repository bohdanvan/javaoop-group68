package com.bvan.oop.lessons9_10.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * @author bvanchuhov
 */
public class LambdaExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> sum = LambdaExample::sum;
        BiFunction<String, Integer, Character> charAt =
                String::charAt;

        Function<String, Character> firstChar =
                s -> charAt.apply(s, 0);

        System.out.println(firstChar.apply("Java"));
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
