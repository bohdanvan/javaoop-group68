package com.bvan.oop.lessons3_4.line;

/**
 * @author bvanchuhov
 */
public class Line {

    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        return Math.sqrt(
                Math.pow(start.getX() - end.getX(), 2) +
                Math.pow(start.getY() - end.getY(), 2)
        );
    }

    @Override
    public String toString() {
        return start + "->" + end;
    }
}
