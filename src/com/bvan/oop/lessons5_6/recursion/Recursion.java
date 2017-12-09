package com.bvan.oop.lessons5_6.recursion;

/**
 * @author bvanchuhov
 */
public class Recursion {

    public static void main(String[] args) {
        long factorial = factorial(100000);
        System.out.println(factorial);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
