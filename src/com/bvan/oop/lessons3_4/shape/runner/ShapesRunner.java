package com.bvan.oop.lessons3_4.shape.runner;

import com.bvan.oop.lessons3_4.shape.Circle;
import com.bvan.oop.lessons3_4.shape.EquilateralTriangle;
import com.bvan.oop.lessons3_4.shape.Rectangle;
import com.bvan.oop.lessons3_4.shape.Shape;
import com.bvan.oop.lessons3_4.shape.Shapes;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.add(new Rectangle(10.0, 20.0)); // 200
        shapes.add(new Circle(10.0)); // 314
        shapes.add(new EquilateralTriangle(100.0));

        double area = shapes.getArea(); // 514
        System.out.println("area = " + area);

        Shape shapeWithMaxPerimeter = shapes.getShapeWithMaxPerimeter();
        System.out.println("shapeWithMaxPerimeter = " + shapeWithMaxPerimeter);
    }
}
