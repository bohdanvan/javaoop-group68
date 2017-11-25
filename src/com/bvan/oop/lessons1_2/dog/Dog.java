package com.bvan.oop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Gav-gav, " + name);
    }

    public void bark(int times) {
        for (int time = 0; time < times; time++) {
            bark();
        }
    }
}
