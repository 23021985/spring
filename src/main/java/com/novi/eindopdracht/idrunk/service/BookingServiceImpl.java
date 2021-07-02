package com.novi.eindopdracht.idrunk.service;

import com.novi.eindopdracht.idrunk.exception.RecordNotFoundException;
import com.novi.eindopdracht.idrunk.model.Booking;
import com.novi.eindopdracht.idrunk.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingRepository bookingRepository;
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBooking(long id) throws RecordNotFoundException {
        return bookingRepository.getById(id);
    }

    @Override
    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public void removeBooking(long id) throws RecordNotFoundException {
        bookingRepository.deleteById(id);
    }

    @Override
    public void updateBooking(long id, Booking booking) throws RecordNotFoundException {

    }
}
