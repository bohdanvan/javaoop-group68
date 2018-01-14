package com.bvan.oop.lessons9_10.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> langs = langs();

        Map<String, Integer> wordToCount = countWords(langs);
        System.out.println(wordToCount);
    }

    public static Map<String, Integer> countWords(
            List<String> words) {

        Map<String, Integer> wordsToCount = new LinkedHashMap<>();

        for (String word : words) {
            if (wordsToCount.containsKey(word)) {
                Integer count = wordsToCount.get(word);
                wordsToCount.put(word, count + 1);
            } else {
                wordsToCount.put(word, 1);
            }
        }
        return wordsToCount;
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
