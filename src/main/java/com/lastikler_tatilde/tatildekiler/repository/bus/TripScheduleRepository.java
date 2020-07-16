package com.lastikler_tatilde.tatildekiler.repository.bus;

import com.lastikler_tatilde.tatildekiler.model.bus.Trip;
import com.lastikler_tatilde.tatildekiler.model.bus.TripSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TripScheduleRepository extends MongoRepository<TripSchedule, String> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}
