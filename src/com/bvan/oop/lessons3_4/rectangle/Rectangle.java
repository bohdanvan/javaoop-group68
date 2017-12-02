package com.bvan.oop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width < 0) {
            throw new IllegalArgumentException("negative width: " + width);
        }
        if (height < 0) {
            throw new IllegalArgumentException("negative hight: " + height);
        }

        this.width = width;
        this.height = height;

    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getArea() {
        return (width * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}