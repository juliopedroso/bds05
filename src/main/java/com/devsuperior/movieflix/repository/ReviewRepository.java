package com.devsuperior.movieflix.repository;

import com.devsuperior.movieflix.entities.Review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long>{
    
}
