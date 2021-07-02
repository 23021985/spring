package com.novi.eindopdracht.idrunk.controler;

import com.novi.eindopdracht.idrunk.exception.RecordNotFoundException;
import com.novi.eindopdracht.idrunk.model.Booking;
import com.novi.eindopdracht.idrunk.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/booking")
public class BookingController {

    @Autowired
    public BookingService bookingService;

    @GetMapping("")
    public ResponseEntity<Object> getBookings(){
        return ResponseEntity.ok(bookingService.getBookings());
    }

    @PostMapping("")
    public ResponseEntity<Object> addBooking(@RequestBody Booking booking){
        bookingService.addBooking(booking);
        return ResponseEntity.ok("Added");
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getBooking(@PathVariable("id") long id) throws RecordNotFoundException {
        Booking booking = bookingService.getBooking(id);
        return ResponseEntity.ok(booking);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateBooking(@PathVariable("id") long id, @RequestBody Booking newBooking) throws RecordNotFoundException {
        bookingService.updateBooking(id, newBooking);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> removeBooking(@PathVariable("id") long id) throws RecordNotFoundException {
        bookingService.removeBooking(id);
        return ResponseEntity.noContent().build();
    }
}