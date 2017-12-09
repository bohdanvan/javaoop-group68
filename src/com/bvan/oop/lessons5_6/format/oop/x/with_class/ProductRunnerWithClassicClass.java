package com.bvan.oop.lessons5_6.format.oop.x.with_class;

import com.bvan.oop.lessons5_6.format.Product;
import com.bvan.oop.lessons5_6.format.oop.Cart;
import com.bvan.oop.lessons5_6.format.oop.Formatter;

/**
 * @author bvanchuhov
 */
public class ProductRunnerWithClassicClass {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

        Formatter formatter = new ToStringFormatter();
        cart.print(formatter);
    }
}
