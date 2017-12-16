package com.bvan.oop.lessons7_8.film;

import com.bvan.oop.lessons7_8.film.Genre;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class Film {

    private final String name;
    private final List<Genre> genres;

    public Film(String name, List<Genre> genres) {
        this.name = name;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public boolean containsInGenres(List<Genre> otherGenres) {
        for (Genre otherGenre : otherGenres) {
            if (!genres.contains(otherGenre)) {
                return false;
            }
        }
        return true;
    }
}
