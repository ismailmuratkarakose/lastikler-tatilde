package com.lastikler_tatilde.tatildekiler.repository.bus;

import com.lastikler_tatilde.tatildekiler.model.bus.Stop;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StopRepository extends MongoRepository<Stop, String> {
    Stop findByCode(String code);
}
