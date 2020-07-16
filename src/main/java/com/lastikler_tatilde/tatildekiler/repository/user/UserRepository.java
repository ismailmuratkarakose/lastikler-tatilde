package com.lastikler_tatilde.tatildekiler.repository.user;

import com.lastikler_tatilde.tatildekiler.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
