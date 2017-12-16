package com.bvan.oop.lessons7_8.generic.format;

/**
 * @author bvanchuhov
 */
public class NameFormatter implements Formatter<Product> {

    @Override
    public String format(Product value) {
        return value.getName();
    }
}
