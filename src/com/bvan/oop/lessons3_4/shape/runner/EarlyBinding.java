package com.bvan.oop.lessons3_4.shape.runner;

/**
 * @author bvanchuhov
 */
public class EarlyBinding {

    public static void main(String[] args) {
        int sum = sum(10, 20);
        String hello = sum("Hello", ", world");

        System.out.println();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String sum(String s1, String s2) {
        return s1 + s2;
    }
}
