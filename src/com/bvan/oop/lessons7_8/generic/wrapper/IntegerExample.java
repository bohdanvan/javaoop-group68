package com.bvan.oop.lessons7_8.generic.wrapper;

/**
 * @author bvanchuhov
 */
public class IntegerExample {

    public static void main(String[] args) {
        Integer x = 10; // autoboxing, int -> Integer
        Integer y = 20;
        Integer z = x + y;
        
        System.out.println(z);
    }
}
