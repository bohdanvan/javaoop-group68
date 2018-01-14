package com.bvan.oop.lessons9_10.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        List<String> langs = langs();

        Set<String> uniqueLangs = new LinkedHashSet<>();
        for (String lang : langs) {
            uniqueLangs.add(lang);
        }

        System.out.println(uniqueLangs);
    }

    private static List<String> langs() {
        return Arrays.asList(
                "Haskell",
                "Java",
                "C#",
                "Haskell",
                "Java",
                "C#",
                "Java",
                "Kotlin",
                "Java",
                "C#",
                "Kotlin",
                "Haskell",
                "Haskell",
                "JavaScript",
                "Kotlin",
                "Haskell"
        );
    }
}
