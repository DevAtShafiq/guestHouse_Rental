package com.example.guesthouse.guest.GuestHouse;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "guest_house")
public class GuestHouse {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "guest_house_seq",sequenceName ="guest_house_sequence")
    private Long id;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "hotel_address")
    private String hotelAddress;
    @Column(name = "phone_number")
    private String phoneNumber;


}
