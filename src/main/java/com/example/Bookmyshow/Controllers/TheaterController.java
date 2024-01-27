package com.example.Bookmyshow.Controllers;


import com.example.Bookmyshow.Requests.AddTheaterRequest;
import com.example.Bookmyshow.Requests.AddTheaterSeatsRequest;
import com.example.Bookmyshow.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("theater")
public class TheaterController {
    @Autowired
    private TheaterService theaterService;

    @PostMapping("/addTheater")
    public String addTheater(@RequestBody AddTheaterRequest addTheaterRequest){

     String result=theaterService.addTheater(addTheaterRequest);
     return result;
    }
    @PostMapping("/addTheaterSeat")
    public String addTheaterSeat (@RequestBody AddTheaterSeatsRequest theaterSeatsRequest){
   String result=theaterService.addTheaterSeats(theaterSeatsRequest);
   return result;

    }
}
