package com.bvan.oop.lessons7_8.generic.format;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Song implements Formattable {

    private final String title;
    private final String author;
    private final int duration;

    public Song(String title, String author, int duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public List<String> getFields() {
        return Arrays.asList(
                title,
                author,
                String.valueOf(duration)
        );
    }
}
