package com.bvan.oop.lessons9_10.set;

import com.bvan.oop.lessons5_6.enum_example.Genre;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class Movie {

    private final String title;
    private final Set<Genre> genres = new LinkedHashSet<>();

    public Movie(String title) {
        this.title = title;
    }

    public void addGenre(Genre genre) {
        genres.add(genre); // O(1)
    }

    public boolean hasGenre(Genre genre) {
        return genres.contains(genre); // O(1)
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;
        return genres != null ? genres.equals(movie.genres) : movie.genres == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (genres != null ? genres.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genres=" + genres +
                '}';
    }
}
