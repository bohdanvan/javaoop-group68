package com.bvan.oop.lessons5_6.format.oop.x.with_class;

import com.bvan.oop.lessons5_6.format.Product;
import com.bvan.oop.lessons5_6.format.oop.Formatter;

/**
 * @author bvanchuhov
 */
public class ToStringFormatter implements Formatter {
    @Override
    public String format(Product product) {
        return product.toString();
    }
}
