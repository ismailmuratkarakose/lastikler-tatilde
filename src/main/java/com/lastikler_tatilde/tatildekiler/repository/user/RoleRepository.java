package com.lastikler_tatilde.tatildekiler.repository.user;

import com.lastikler_tatilde.tatildekiler.model.user.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);

}
