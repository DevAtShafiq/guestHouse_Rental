package com.example.guesthouse.guest.GuestHouse;

import com.example.guesthouse.guest.booking.Booking;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.stream.Location;
import java.awt.print.Book;
import java.util.List;

@Data


public class GuestHouse {

    private Long id;
    private String name;
    private String location;
    private String telephone;
    @OneToMany
    private List<Booking> guestHouseBooking;

    public GuestHouse() {
    }

    public GuestHouse(String name, String location, String telephone) {
        this.name = name;
        this.location = location;
        this.telephone = telephone;
    }
}
