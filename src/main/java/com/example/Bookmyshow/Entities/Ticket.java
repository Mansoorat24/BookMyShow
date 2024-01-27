package com.example.Bookmyshow.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tickets")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer ticketId;
    private String seatNoBooked;
    private Integer totalAmountPaid;
    @JoinColumn
    @ManyToOne
    @JsonIgnore
    private Show show;



}
