package com.bvan.oop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public class GenreExample {

    public static void main(String[] args) {
        Genre genre = Genre.COMEDY;
        System.out.println(genre.name()); // enum -> String
        System.out.println(genre.ordinal()); // enum -> int

        // String -> enum
        Genre genre2 = Genre.valueOf("ACTION");
        System.out.println(genre2);

        // int -> enum
        Genre[] genres = Genre.values();
        Genre genre3 = genres[0];
        System.out.println(genre3);
    }
}
