package com.example.guesthouse.guest.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    final BookingService bookingService;


    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/book")
    public ResponseEntity<String> makeBooking(@RequestBody Booking booking) {

        bookingService.makeBooking(booking);

        return ResponseEntity.ok("Booking is successfully completed"
                +" "+"Long Id:"+" "+booking.getId()
                +" Booking Id:"
                +booking.getBookingNumber());
    }
}
