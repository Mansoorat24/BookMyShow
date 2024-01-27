package com.example.Bookmyshow.Requests;

import com.example.Bookmyshow.Enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
public class BookTicketRequest {

    public int showId;
    public List<String> seatList;
    private SeatType seatType;

}
