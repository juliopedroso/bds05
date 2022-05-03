package com.devsuperior.movieflix.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<UserDTO> findAll() {
        List<User> users =  repository.findAll();

        return users.stream().map(UserDTO::new).collect(Collectors.toList());
    }


}
