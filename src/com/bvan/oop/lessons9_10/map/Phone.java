package com.bvan.oop.lessons9_10.map;

/**
 * @author bvanchuhov
 */
public class Phone {

    private final String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                '}';
    }
}
