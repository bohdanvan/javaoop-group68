package com.bvan.oop.lessons3_4.line;

/**
 * @author bvanchuhov
 */
public class PointRunner {

    public static void main(String[] args) {
        Lines lines = new Lines();
        lines.add(new Line(new Point(3, 0), new Point(0, 4))); // 5.0
        lines.add(new Line(new Point(0, 0), new Point(0, 10))); // 10
        lines.add(new Line(new Point(20.0, 0), new Point(18, 0))); // 2

        double sumLength = lines.getSumLength();
        System.out.println("sumLength = " + sumLength);

        Line longestLine = lines.getLongestLine();
        System.out.println("longestLine = " + longestLine);
    }
}
