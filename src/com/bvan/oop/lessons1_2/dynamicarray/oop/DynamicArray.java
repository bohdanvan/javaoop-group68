package com.bvan.oop.lessons1_2.dynamicarray.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    // fields
    private int[] elems;
    private int size = 0;

    // constructor

    public DynamicArray(int initSize) {
        elems = new int[initSize];
    }

    public DynamicArray() {
        this(4);
    }

    // methods

    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int)(1.5 * elems.length);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            String s = String.valueOf(elems[i]);
            joiner.add(s);
        }
        return joiner.toString();
    }

    public int getSize() {
        return size;
    }
}
