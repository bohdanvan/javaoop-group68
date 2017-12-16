package com.bvan.oop.lessons7_8.sorting;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(30, 25)); // > 0
        System.out.println(Integer.compare(20, 20)); // 0
        System.out.println();

        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("Home".compareTo("Home")); // 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println();

        LocalDate ld1 = LocalDate.of(2017, 5, 1);
        LocalDate ld2 = LocalDate.of(1992, 8, 15);

        System.out.println(ld1.compareTo(ld2)); // > 0
    }
}
