package com.example.Bookmyshow.Requests;


import lombok.Data;

@Data
public class AddShowSeatsRequest {

    private int priceForClassicSeats;
    private int priceForPremiumSeats;
    private int showId;
}
