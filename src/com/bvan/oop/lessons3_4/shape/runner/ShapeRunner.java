package com.bvan.oop.lessons3_4.shape.runner;

import com.bvan.oop.lessons3_4.shape.Circle;
import com.bvan.oop.lessons3_4.shape.Rectangle;
import com.bvan.oop.lessons3_4.shape.Shape;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Shape s1 = new Rectangle(10.0, 20.0);
        Shape s2 = new Circle(10.0);

        printInfo(s1);
        printInfo(s2);
    }

    public static void printInfo(Shape shape) {
        System.out.println("name = " + shape.getName());
        System.out.println("S = " + shape.getArea());
        System.out.println("P = " + shape.getPerimeter());
        System.out.println();
    }
}
