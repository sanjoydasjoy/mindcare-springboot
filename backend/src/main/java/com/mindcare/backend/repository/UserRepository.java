package com.mindcare.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mindcare.backend.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
