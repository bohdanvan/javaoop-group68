package com.bvan.oop.lessons1_2.dynamicarray;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ReadClientElemTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = DynamicArrayApp.readClientElem(scanner);
        System.out.println("n = " + n);
    }
}
