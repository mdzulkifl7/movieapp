package com.upgrad.movieapp.DTO;

import java.time.LocalDateTime;
import java.util.Objects;

public class MovieDTO {

    private int movieId;
    private String movieName;
    private String movieDescription;
    private LocalDateTime releaseDate;
    private int duration;
    private String coverPhotoUrl;
    private String trailerUrl;

    public MovieDTO(int movieId, String movieName, String movieDescription, LocalDateTime releaseDate, int duration, String coverPhotoUrl, String trailerUrl) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.coverPhotoUrl = coverPhotoUrl;
        this.trailerUrl = trailerUrl;

    }
    public MovieDTO(int movieId, String movieName, String no_way_home, int i, int duration, String coverPhoto, String spiderman_trailer){}

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", coverPhotoUrl='" + coverPhotoUrl + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return movieId == movieDTO.movieId && duration == movieDTO.duration && Objects.equals(movieName, movieDTO.movieName) && Objects.equals(movieDescription, movieDTO.movieDescription) && Objects.equals(releaseDate, movieDTO.releaseDate) && Objects.equals(coverPhotoUrl, movieDTO.coverPhotoUrl) && Objects.equals(trailerUrl, movieDTO.trailerUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, movieName, movieDescription, releaseDate, duration, coverPhotoUrl, trailerUrl);
    }
}
