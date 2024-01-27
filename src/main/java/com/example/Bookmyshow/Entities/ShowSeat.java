package com.example.Bookmyshow.Entities;

import com.example.Bookmyshow.Enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

@Entity
@Table(name="show_seats")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showSeatId;
    private int price;

    private boolean isAvailable;
    private boolean foodAttached;
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    @JoinColumn
    @ManyToOne
    @JsonIgnore
    private Show show;



}
