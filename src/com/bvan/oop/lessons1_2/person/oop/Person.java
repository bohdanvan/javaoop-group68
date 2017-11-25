package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name; // BP
    private final int age;

    public Person(String name, int age) {
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("negative age: " + age);
        }
    }

    public Person(String name) {
        this(name, 0);
    }

    private boolean isAge(int n) {
        return n >= 0 && n <= 120;
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", "
                + age + " years old";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person withName(String name) {
        return new Person(name, this.age);
    }
}
