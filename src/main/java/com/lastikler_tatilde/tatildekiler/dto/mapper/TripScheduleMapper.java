package com.lastikler_tatilde.tatildekiler.dto.mapper;

import com.lastikler_tatilde.tatildekiler.dto.model.bus.TripScheduleDto;
import com.lastikler_tatilde.tatildekiler.model.bus.Trip;
import com.lastikler_tatilde.tatildekiler.model.bus.TripSchedule;


public class TripScheduleMapper {
    public static TripScheduleDto toTripScheduleDto(TripSchedule tripSchedule) {
        Trip tripDetails = tripSchedule.getTripDetail();
        return new TripScheduleDto()
                .setId(tripSchedule.getId())
                .setTripId(tripDetails.getId())
                .setBusCode(tripDetails.getBus().getCode())
                .setAvailableSeats(tripSchedule.getAvailableSeats())
                .setFare(tripDetails.getFare())
                .setJourneyTime(tripDetails.getJourneyTime())
                .setSourceStop(tripDetails.getSourceStop().getName())
                .setDestinationStop(tripDetails.getDestStop().getName());
    }
}
