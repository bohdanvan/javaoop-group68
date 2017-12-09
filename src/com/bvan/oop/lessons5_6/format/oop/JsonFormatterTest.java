package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class JsonFormatterTest {

    public static void main(String[] args) {
        Product product = new Product("Acer", 1800);
        Formatter formatter = new JsonFormatter();
        String s = formatter.format(product);
        System.out.println(s);
    }
}
