package com.example.Bookmyshow.Services;

import com.example.Bookmyshow.Entities.Show;
import com.example.Bookmyshow.Entities.ShowSeat;
import com.example.Bookmyshow.Entities.Ticket;
import com.example.Bookmyshow.Repository.ShowRepository;
import com.example.Bookmyshow.Repository.TicketRepository;
import com.example.Bookmyshow.Requests.BookTicketRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private TicketRepository ticketRepository;

    public String bookTicket(BookTicketRequest bookTicketRequest) throws Exception{

        Show show = showRepository.findById(bookTicketRequest.getShowId()).get();

        List<ShowSeat> showSeatList = show.getShowSeatList();
        int totalBookingAmount = 0;
        for(String seatNoToBeBooked : bookTicketRequest.getSeatList()){

            for(ShowSeat showSeat:showSeatList){

                if(showSeat.getSeatNo().equals(seatNoToBeBooked)&&
                        (bookTicketRequest.getSeatType().equals(showSeat.getSeatType()))){

                    if(showSeat.isAvailable()){
                        showSeat.setAvailable(Boolean.FALSE);
                        totalBookingAmount = totalBookingAmount+showSeat.getPrice();
                    }else{
                        throw new Exception("Seat No "+showSeat.getSeatNo()+" is already booked.");
                    }
                }
            }
        }
        Ticket ticket= Ticket.builder()
                .seatNoBooked(bookTicketRequest.getSeatList().toString())
                .totalAmountPaid(totalBookingAmount)
                .show(show)
                .build();

        show.getTicketList().add(ticket);
       ticket =ticketRepository.save(ticket);
       return "This is the ticket with the ticketId"+ticket.getTicketId();

    }

    }

