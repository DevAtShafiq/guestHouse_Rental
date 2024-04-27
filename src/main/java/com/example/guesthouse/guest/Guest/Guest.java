package com.example.guesthouse.guest.Guest;

import com.example.guesthouse.guest.booking.Booking;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@Table(
        name = "guest"
)
public class Guest {
    @Id
    @SequenceGenerator(name = "guest_seq", sequenceName = "guest_sequence")

    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "guest", cascade = CascadeType.ALL,orphanRemoval = true)

    List<Booking> bookingList;

    public Guest() {
    }

    public Guest(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}




