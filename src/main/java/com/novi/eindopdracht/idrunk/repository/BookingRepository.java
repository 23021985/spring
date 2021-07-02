package com.novi.eindopdracht.idrunk.repository;

import com.novi.eindopdracht.idrunk.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository <Booking, Long> {
}
