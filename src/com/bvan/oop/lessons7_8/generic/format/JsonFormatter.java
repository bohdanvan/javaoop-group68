package com.bvan.oop.lessons7_8.generic.format;

/**
 * @author bvanchuhov
 */
public class JsonFormatter implements Formatter<Product> {

    @Override
    public String format(Product value) {
        return "{\"name\": \"" + value.getName() + "\", \"price\": " + value.getPrice() + "}";
    }
}
