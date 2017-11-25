package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 10);
        Person p2 = new Person("Vlad");

        String info1 = p1.sayHello();
        String info2 = p2.sayHello();

        System.out.println(info1);
        System.out.println(info2);
    }
}
