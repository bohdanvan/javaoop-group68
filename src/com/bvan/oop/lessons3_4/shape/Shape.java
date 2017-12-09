package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public interface Shape {

    double getPerimeter();
    double getArea();

    default String getName() {
        return "unnamed";
    }

    default void draw() {
        throw new UnsupportedOperationException();
    }
}
