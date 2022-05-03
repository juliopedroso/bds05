package com.devsuperior.movieflix.repository;

import com.devsuperior.movieflix.entities.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    
}
