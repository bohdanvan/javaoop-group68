package com.bvan.oop.lessons9_10.lambda;

import java.util.function.Consumer;

/**
 * @author bvanchuhov
 */
public class Repeat {

    public static void main(String[] args) {
        repeat(3, j -> {
            repeat(j + 1, i -> System.out.println("Hello"));
            System.out.println();
        });
    }

    private static void repeat(int count,
                               Consumer<Integer> action) {
        for (int i = 0; i < count; i++) {
            action.accept(i);
        }
    }
}
