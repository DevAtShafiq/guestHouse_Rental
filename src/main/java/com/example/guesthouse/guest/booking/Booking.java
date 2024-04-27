package com.example.guesthouse.guest.booking;

import com.example.guesthouse.guest.Guest.Guest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

@Entity
public class Booking {
    @Id
    @SequenceGenerator(name = "booking_seq", sequenceName = "booking_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private LocalDate bookingDate;
    private String bookingNumber;
    @ManyToOne
    private Guest guest;





}
