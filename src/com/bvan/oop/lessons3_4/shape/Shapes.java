package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public Shape get(int index) {
        return shapes.get(index);
    }

    public double getArea() {
        double area = 0.0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }

    public Shape getShapeWithMaxPerimeter() {
        if (shapes.isEmpty()) {
            throw new IllegalStateException("empty list");
        }

        Shape res = shapes.get(0);
        for (Shape shape : shapes) {
            if (res.getPerimeter() < shape.getPerimeter()) {
                res = shape;
            }
        }
        return res;
    }
}
