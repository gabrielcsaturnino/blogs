package org.example.blogs.services;

import org.example.blogs.model.User;
import org.example.blogs.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User findUser(UUID uuid){
        Optional<User> user = userRepository.findById(uuid);
        return user.get();
    }
}
