package com.lastikler_tatilde.tatildekiler.repository.bus;

import com.lastikler_tatilde.tatildekiler.model.bus.Agency;
import com.lastikler_tatilde.tatildekiler.model.bus.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BusRepository extends MongoRepository<Bus, String> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
