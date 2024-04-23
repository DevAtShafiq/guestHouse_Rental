package com.example.guesthouse.guest.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BookingService {

    final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    public void makeBooking(Booking booking) {

        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 7; i++) {
            char randChar = (char) (random.nextInt(26) + 'A');
            stringBuilder.append(randChar);
        }
       booking.setBookingNumber(stringBuilder.toString());


        bookingRepository.save(booking);


    }

}
