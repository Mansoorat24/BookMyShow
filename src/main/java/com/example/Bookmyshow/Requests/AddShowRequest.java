package com.example.Bookmyshow.Requests;

import com.example.Bookmyshow.Entities.Theater;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class AddShowRequest {

    private LocalDate showDate;

    private LocalTime showTime;

    private String movieName;

    private int theaterId;
}
