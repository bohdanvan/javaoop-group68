package com.bvan.oop.lessons5_6.person;

/**
 * @author bvanchuhov
 */
public abstract class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sayHello();

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
