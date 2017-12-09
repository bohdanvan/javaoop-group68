package com.bvan.oop.lessons5_6.format.oop.x.with_lambda;

import com.bvan.oop.lessons5_6.format.Product;
import com.bvan.oop.lessons5_6.format.oop.Cart;
import com.bvan.oop.lessons5_6.format.oop.Formatter;

/**
 * @author bvanchuhov
 */
public class ProductRunnerWithLambda {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

        Formatter formatterWithAnonymous = new Formatter() {
            @Override
            public String format(Product p) {
                return p.toString();
            }
        };

        // Java 8
        Formatter formatterWithLambda = p -> p.toString();

        cart.print(formatterWithLambda);
    }

}
