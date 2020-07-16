package com.lastikler_tatilde.tatildekiler.repository.bus;

import com.lastikler_tatilde.tatildekiler.model.bus.Agency;
import com.lastikler_tatilde.tatildekiler.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AgencyRepository extends MongoRepository<Agency, String> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
