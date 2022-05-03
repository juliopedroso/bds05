package com.devsuperior.movieflix.repository;

import com.devsuperior.movieflix.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
