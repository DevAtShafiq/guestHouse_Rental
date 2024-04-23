package com.example.guesthouse.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {

    final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping("/guest")
     public ResponseEntity<String> showGuest(@RequestBody Guest guest ){

        guestService.createGuest(guest);
        return ResponseEntity.ok("successfully inserted");
    }
}
