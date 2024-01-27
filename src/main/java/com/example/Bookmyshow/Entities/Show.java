package com.example.Bookmyshow.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="show")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showId;
    private LocalDate showDate;
    private LocalTime showTime;
    @JoinColumn
    @ManyToOne
    @JsonIgnore
    private Movie movie;
    @JsonIgnore
     @JoinColumn
    @ManyToOne
    private Theater theater;

     @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<ShowSeat> showSeatList=new ArrayList<>();

     @OneToMany(mappedBy ="show",cascade=CascadeType.ALL)
    private List<Ticket> ticketList=new ArrayList<>();

    public Show(LocalDate showDate, LocalTime showTime) {
        this.showDate = showDate;
        this.showTime = showTime;
    }
}
