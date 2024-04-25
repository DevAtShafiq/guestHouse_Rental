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
    ArrayList<Booking>bookList=new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Booking> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Booking> bookList) {
        this.bookList = bookList;
    }
}
