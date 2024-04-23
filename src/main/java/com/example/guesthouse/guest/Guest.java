package com.example.guesthouse.guest;

import com.example.guesthouse.guest.booking.Booking;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Guest {
    @Id
    @SequenceGenerator(name = "guest_seq",sequenceName = "guest_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "guest",cascade = CascadeType.PERSIST)
    ArrayList<Booking>bookList=new ArrayList<Booking>();

}
