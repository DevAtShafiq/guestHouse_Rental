package com.example.guesthouse.guest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuestHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestHouseApplication.class, args);


    }
public void run(String... args) throws Exception {


        Guest guest = new Guest();
        guest.setName("Guest");
        guest.setId(1010L);
        guest.setId(1010L);

}



}
