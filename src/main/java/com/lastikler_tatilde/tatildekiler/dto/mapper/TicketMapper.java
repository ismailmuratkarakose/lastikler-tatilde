package com.lastikler_tatilde.tatildekiler.dto.mapper;

import com.lastikler_tatilde.tatildekiler.dto.model.bus.TicketDto;
import com.lastikler_tatilde.tatildekiler.model.bus.Ticket;


public class TicketMapper {
    public static TicketDto toTicketDto(Ticket ticket) {
        return new TicketDto()
                .setId(ticket.getId())
                .setBusCode(ticket.getTripSchedule().getTripDetail().getBus().getCode())
                .setSeatNumber(ticket.getSeatNumber())
                .setSourceStop(ticket.getTripSchedule().getTripDetail().getSourceStop().getName())
                .setDestinationStop(ticket.getTripSchedule().getTripDetail().getDestStop().getName())
                .setCancellable(false)
                .setJourneyDate(ticket.getJourneyDate())
                .setPassengerName(ticket.getPassenger().getFullName())
                .setPassengerMobileNumber(ticket.getPassenger().getMobileNumber());
    }
}
