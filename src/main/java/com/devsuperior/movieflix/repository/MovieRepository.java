package com.devsuperior.movieflix.repository;

import com.devsuperior.movieflix.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    
}
