package com.example.Bookmyshow.Entities;

import com.example.Bookmyshow.Enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="theater_seats")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TheaterSeat {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer TheaterSeatId;
    private String seatNo;

    @Enumerated(value=EnumType.STRING)
    private SeatType seatType;
    @JoinColumn
    @ManyToOne
    private Theater theater;


}
