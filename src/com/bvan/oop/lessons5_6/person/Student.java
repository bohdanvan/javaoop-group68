package com.bvan.oop.lessons5_6.person;

/**
 * @author bvanchuhov
 */
public class Student extends Person {

    private final String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void sayHello() {
        System.out.println("I'm " + getName() + ", student from " + university);
    }

    public void study() {
        System.out.println("I study hardly");
    }
}
