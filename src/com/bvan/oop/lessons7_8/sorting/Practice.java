package com.bvan.oop.lessons7_8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Practice {

    public static void main(String[] args) {
        List<String> langs = Arrays.asList(
                "Java",
                "JavaScript",
                "Python",
                "C#"
        );

        Collections.sort(langs);
        System.out.println("Alphabet order, ASC: " + langs);

        Collections.sort(langs, Collections.reverseOrder());
        System.out.println("Alphabet order, DESC: " + langs);

        Collections.sort(langs, new LengthComparator());
        System.out.println("Length order, ASC: " + langs);

        Collections.sort(langs, new LengthComparator().reversed());
        System.out.println("Length order, DESC: " + langs);
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}