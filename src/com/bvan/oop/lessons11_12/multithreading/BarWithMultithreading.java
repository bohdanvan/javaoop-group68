package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int drinkerId = 1; drinkerId <= 3; drinkerId++) {
            new Thread(new Drinker(drinkerId)).start();
        }

        ThreadUtils.println("Bar is closed");
    }
}
