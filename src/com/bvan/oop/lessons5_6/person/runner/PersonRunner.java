package com.bvan.oop.lessons5_6.person.runner;

import com.bvan.oop.lessons5_6.person.Developer;
import com.bvan.oop.lessons5_6.person.Person;
import com.bvan.oop.lessons5_6.person.Student;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person p1 = new Student("Ivan", 20, "KPI");
        p1.sayHello();

        Person p2 = new Developer("Taras", 30, "Google");
        p2.sayHello();
    }
}
