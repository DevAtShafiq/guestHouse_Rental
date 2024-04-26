package com.example.guesthouse.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    final GuestRepository guestRepository;



@Autowired
    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;

}




    public void createGuest(Guest guest){
       guestRepository.save(guest);
   }

  public List<Guest> showAllGuest(){
    return  guestRepository.findAll();
  }





}
