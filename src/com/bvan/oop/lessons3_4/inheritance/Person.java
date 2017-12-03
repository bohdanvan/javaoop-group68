package com.bvan.oop.lessons3_4.inheritance;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("I'm " + name);
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }
}
