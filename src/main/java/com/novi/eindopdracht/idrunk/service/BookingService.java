package com.novi.eindopdracht.idrunk.service;

import com.novi.eindopdracht.idrunk.exception.RecordNotFoundException;
import com.novi.eindopdracht.idrunk.model.Booking;

import java.util.List;

public interface BookingService {

    List<Booking>getBookings();
    Booking getBooking(long id) throws RecordNotFoundException;
    Booking addBooking(Booking booking);
    void removeBooking(long id) throws RecordNotFoundException;
    void updateBooking(long id, Booking booking) throws RecordNotFoundException;


}
