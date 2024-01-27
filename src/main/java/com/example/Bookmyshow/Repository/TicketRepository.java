package com.example.Bookmyshow.Repository;

import com.example.Bookmyshow.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
