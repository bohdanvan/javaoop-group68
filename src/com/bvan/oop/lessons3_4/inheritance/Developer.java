package com.bvan.oop.lessons3_4.inheritance;

/**
 * @author bvanchuhov
 */
public class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void writeCode() {
        System.out.println("I write code in " + company);
    }

    @Override
    public void sayHello() {
        System.out.println("I'm " + getName() +" from " + company);
        super.sayHello();
    }
}
