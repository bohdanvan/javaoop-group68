package com.bvan.oop.lessons7_8.generic.format;

/**
 * @author bvanchuhov
 */
public class ProductPrinterRunner {

    public static void main(String[] args) {
        Printer<Product> printer = new Printer<>();
        printer.add(new Product("MacBook", 2000));
        printer.add(new Product("Lenovo", 1500));
        printer.add(new Product("Asus", 1700));

        printer.print(new JsonFormatter());
        System.out.println();

        CsvFormatter<Product> formatter = new CsvFormatter<>();
        printer.print(formatter);
    }
}
