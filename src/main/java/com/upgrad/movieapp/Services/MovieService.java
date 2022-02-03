package com.upgrad.movieapp.Services;

import com.upgrad.movieapp.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieService {

    public Movie acceptMovieDetails(Movie movie);

    public List<Movie> acceptAllMovieDetails(List<Movie>movies);

    public Movie getMovieDetails(int id);

    public Movie updateMovieDetails(int id, Movie movie);

    public Boolean deleteMovie(int id);

    public List<Movie> getAllMovies();

    public Page<Movie> getPaginatedMovieDetails(Pageable pageRequest);
}
