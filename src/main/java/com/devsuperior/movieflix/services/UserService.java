package com.devsuperior.movieflix.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService  implements UserDetailsService {
    
    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;
    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        List<User> users =  repository.findAll();

        return users.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repository.findByEmail(username);
        if (user == null){
            logger.error("User not found: {}" , username);
            throw new UsernameNotFoundException("Email not found");
        }
        logger.info("User found: {}" , username);
        return user;
    }

    @Transactional(readOnly = true)
    public UserDTO getProfile() {
        User user = authService.authenticated();
        return new UserDTO(user);
    }


}
