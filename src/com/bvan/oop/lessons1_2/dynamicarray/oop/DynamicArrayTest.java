package com.bvan.oop.lessons1_2.dynamicarray.oop;

/**
 * @author bvanchuhov
 */
public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da1 = new DynamicArray(20);
        DynamicArray da2 = new DynamicArray();

        da1.addLast(10);
        da1.addLast(20);

        da2.addLast(30);

        System.out.println(da1.toString()); // [10, 20]
        System.out.println(da2.toString()); // [30]
    }
}
