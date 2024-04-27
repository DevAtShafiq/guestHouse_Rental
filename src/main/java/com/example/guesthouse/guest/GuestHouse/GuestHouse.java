package com.example.guesthouse.guest.GuestHouse;

import com.example.guesthouse.guest.booking.Booking;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Table(name = "guestHouse")
public class GuestHouse {

    @Id
    @SequenceGenerator(name = "guest_house_seq",sequenceName = "guestHouseSeq")
    @GeneratedValue(strategy = SEQUENCE,generator = "id_generator")
    @Column(unique = true,name = "id")

    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(mappedBy = "guestHouse")
    @JoinTable(
            name = "guestHouse_booking",
            joinColumns = @JoinColumn (name = "guest_house_id"),
            inverseJoinColumns = @JoinColumn(name = "booking_id")
    )

    private List<Booking> guestHouseBooking;

    public GuestHouse() {
    }

    public GuestHouse(String name, String location, String telephone) {
        this.name = name;
        this.location = location;
        this.telephone = telephone;
    }
}
