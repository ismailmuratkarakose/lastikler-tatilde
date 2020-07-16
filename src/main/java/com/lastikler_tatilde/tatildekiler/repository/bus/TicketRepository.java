package com.lastikler_tatilde.tatildekiler.repository.bus;

import com.lastikler_tatilde.tatildekiler.model.bus.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TicketRepository extends MongoRepository<Ticket, Long> {
}
