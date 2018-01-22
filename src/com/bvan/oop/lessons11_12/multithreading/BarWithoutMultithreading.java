package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithoutMultithreading {

    public static void main(String[] args) {
        System.out.println("Bar is opened");

        new Drinker(1).run();
        new Drinker(2).run();
        new Drinker(3).run();

        System.out.println("Bar is closed");
    }
}

