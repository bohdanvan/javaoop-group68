package com.bvan.oop.lessons1_2.dynamicarray.oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class OOPDynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray elems = readClientElemsFromConsole();
        System.out.println(elems.toString());
        System.out.println("Goodbye");
    }

    private static DynamicArray readClientElemsFromConsole() {
        RepeatableReader reader = new RepeatableReader(System.in);

        DynamicArray elems = new DynamicArray();

        int n = reader.readInt();
        while (n != 0) {
            elems.addLast(n);

            n = reader.readInt();
        }
        return elems;
    }
}
