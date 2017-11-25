package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class ImmutablePersonRunner {

    public static void main(String[] args) {
        Person taras = new Person("Taras", 25); // immutable
        Person vlad = taras.withName("Vlad");

        System.out.println(taras.sayHello());
        System.out.println(vlad.sayHello());
    }
}
