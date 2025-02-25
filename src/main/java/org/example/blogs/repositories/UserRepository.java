package org.example.blogs.repositories;

import org.example.blogs.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends CrudRepository <User, UUID> {
     Optional<User> findById(UUID uuid);
}
