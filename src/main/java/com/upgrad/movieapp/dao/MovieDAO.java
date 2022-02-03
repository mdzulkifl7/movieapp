package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDAO extends JpaRepository <Movie,Integer> {
}
