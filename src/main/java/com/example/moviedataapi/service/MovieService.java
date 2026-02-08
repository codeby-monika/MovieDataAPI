package com.example.moviedataapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.moviedataapi.model.Movie;

@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public MovieService() {
        // Pre-populate movies
        movies.add(new Movie(1L, "Harry Potter", "Fantasy adventure about a wizard", 2001));
        movies.add(new Movie(2L, "Spider-Man", "Superhero action", 2002));
        movies.add(new Movie(3L, "Stranger Things", "Sci-fi horror TV series", 2016));
        movies.add(new Movie(4L, "Alice in Borderland", "Thriller survival TV series", 2020));
        movies.add(new Movie(5L, "All of Us Are Dead", "Zombie high school survival", 2022));
        movies.add(new Movie(6L, "Squid Game", "Survival game thriller series", 2021));
    }

    public Movie addMovie(Movie movie) {
        movies.add(movie);
        return movie;
    }

    public Movie getMovieById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
