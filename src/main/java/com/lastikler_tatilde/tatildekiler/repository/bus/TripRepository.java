package com.lastikler_tatilde.tatildekiler.repository.bus;

import com.lastikler_tatilde.tatildekiler.model.bus.Agency;
import com.lastikler_tatilde.tatildekiler.model.bus.Bus;
import com.lastikler_tatilde.tatildekiler.model.bus.Stop;
import com.lastikler_tatilde.tatildekiler.model.bus.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface TripRepository extends MongoRepository<Trip, String> {
    Trip findBySourceStopAndDestStopAndBus(Stop source, Stop destination, Bus bus);

    List<Trip> findAllBySourceStopAndDestStop(Stop source, Stop destination);

    List<Trip> findByAgency(Agency agency);
}
