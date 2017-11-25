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
        Scanner scanner = new Scanner(System.in);

        DynamicArray elems = new DynamicArray();

        int n = readClientElem(scanner);
        while (n != 0) {
            elems.addLast(n);

            n = readClientElem(scanner);
        }
        return elems;
    }

    public static int readClientElem(Scanner scanner) {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Sorry, illegal input");

            System.out.print(">> ");
        }

        return scanner.nextInt();
    }

    private static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length + 1);
        newElems[newElems.length - 1] = n;
        return newElems;
    }
}
