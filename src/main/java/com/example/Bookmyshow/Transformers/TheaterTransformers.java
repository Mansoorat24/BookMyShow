package com.example.Bookmyshow.Transformers;

import com.example.Bookmyshow.Entities.Theater;
import com.example.Bookmyshow.Requests.AddTheaterRequest;

public class TheaterTransformers {

    public static Theater convertRequestToEntity(AddTheaterRequest theaterRequest){

        Theater theater = Theater.builder()
                .address(theaterRequest.getAddress())
                .noOfScreens(theaterRequest.getNoOfScreens())
                .name(theaterRequest.getName())
                .build();

        return theater;
    }
}
