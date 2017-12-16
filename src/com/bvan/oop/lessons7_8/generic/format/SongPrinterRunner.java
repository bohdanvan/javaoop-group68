package com.bvan.oop.lessons7_8.generic.format;

/**
 * @author bvanchuhov
 */
public class SongPrinterRunner {

    public static void main(String[] args) {
        Printer<Song> printer = new Printer<>();
        printer.add(new Song("T 1", "A 1", 5));
        printer.add(new Song("T 2", "A 2", 3));
        printer.add(new Song("T 3", "A 3", 4));

        printer.print(new ToStringFormatter<>());
        System.out.println();

        CsvFormatter<Song> formatter = new CsvFormatter<>("|");
        printer.print(formatter);
    }
}
