package com.bvan.oop.lessons3_4.rectangle;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public int getArea() {
        int totalArea = 0;
        for (Rectangle rectangle : rectangles) {
            totalArea += rectangle.getArea();
        }
        return totalArea;
    }

    public int getSize() {
        return rectangles.size();
    }
}
