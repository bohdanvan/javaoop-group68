package com.bvan.oop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public class Example {

    public static void main(String[] args) {
        Genre g1 = Genre.ACTION;
        Genre g2 = Genre.ACTION;
        Genre g3 = Genre.COMEDY;

        System.out.println(g1 == g2);
        System.out.println(g1 == g3);
    }
}
