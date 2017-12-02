package com.bvan.oop.lessons3_4.line;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Lines {

    private final ArrayList<Line> lines = new ArrayList<>();

    public void add(Line line) {
        lines.add(line);
    }

    public double getSumLength() {
        double sumLength = 0.0;
        for (Line line : lines) {
            sumLength += line.getLength();
        }
        return sumLength;
    }

    public Line getLongestLine() {
        if (lines.isEmpty()) {
            throw new IllegalStateException("empty lines");
        }

        Line longestLine = lines.get(0);
        for (Line line : lines) {
            if (longestLine.getLength() < line.getLength()) {
                longestLine = line;
            }
        }
        return longestLine;
    }
}
