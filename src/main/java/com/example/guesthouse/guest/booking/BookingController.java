package com.example.guesthouse.guest.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookingController {

    final BookingService bookingService;


    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/make")
    public ResponseEntity<String> makeBooking(@RequestBody Booking booking) {

        bookingService.makeBooking(booking);

        return ResponseEntity.ok(
                "Booking is successfully completed"
                +" "+"Long Id:"+" "+booking.getId()
                +" Booking Id:"
                +booking.getBookingNumber());
    }



    @GetMapping("/show-all")
    public List<Booking> showBookings( ){

        return bookingService.showALlBooking();
    }
}
