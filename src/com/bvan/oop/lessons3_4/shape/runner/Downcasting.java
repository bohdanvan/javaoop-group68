package com.bvan.oop.lessons3_4.shape.runner;

import com.bvan.oop.lessons3_4.shape.Circle;
import com.bvan.oop.lessons3_4.shape.Rectangle;
import com.bvan.oop.lessons3_4.shape.Shape;
import com.bvan.oop.lessons3_4.shape.Shapes;

/**
 * @author bvanchuhov
 */
public class Downcasting {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.add(new Rectangle(10.0, 20.0));
        shapes.add(new Circle(10.0));

        Shape shape = shapes.get(0);
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape; // BAD COD
            System.out.println(rectangle.getWidth());
        }
    }
}
