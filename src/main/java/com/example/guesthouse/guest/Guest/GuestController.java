package com.example.guesthouse.guest.Guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping("/add")
     public ResponseEntity<String> addGuest(@RequestBody Guest guest ){

        guestService.createGuest(guest);
        return ResponseEntity.ok("HttpStatus.CREATED");
    }

    @GetMapping("/show-all")
     public List<Guest> addGuest( ){

       return guestService.showAllGuest();

    }





}
