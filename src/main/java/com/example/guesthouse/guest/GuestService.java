package com.example.guesthouse.guest;

import org.springframework.stereotype.Service;

@Service
public class GuestService {

    final GuestRepository guestRepository;


    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

   public void createGuest(Guest guest){
       guestRepository.save(guest);
   }
}
